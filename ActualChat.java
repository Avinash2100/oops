class User extends Thread {
    private String[] chatLog;
    volatile boolean running = true, paused = false;

    public User(String name, int priority, String[] messages) {
        super(name);
        this.chatLog = messages;
        setPriority(priority);
    }

    public void suspendUser() { paused = true; }
    public synchronized void resumeUser() { paused = false; notify(); }
    public synchronized void stopUser() { running = false; resumeUser(); }

    public void run() {
        for (String msg : chatLog) {
            synchronized(this) {
                while (paused) { try { wait(); } catch (InterruptedException e) {} }
            }
            if (!running) break;

            System.out.println(getName() + ": " + msg);
            try { Thread.sleep(800); } catch (InterruptedException e) {}
        }
    }
}

public class ActualChat {
    public static void main(String[] args) throws Exception {
        // Defining the actual messages
        String[] aliceText = {"Hey Bob!", "Did you finish the lab?", "I'm stuck on part 2."};
        String[] bobText = {"Hi Alice!", "Almost done.", "I'll send you my notes."};

        User alice = new User("Alice", Thread.MAX_PRIORITY, aliceText);
        User bob = new User("Bob", Thread.MIN_PRIORITY, bobText);

        alice.start();
        bob.start();

        // Demonstrating the objectives
        System.out.println("Checking Alice: " + (alice.isAlive() ? "Online" : "Offline"));

        alice.suspendUser();
        System.out.println(">> Alice is typing slowly (Suspended)...");
        Thread.sleep(1500); 
        
        alice.resumeUser();
        
        // Let them finish, then join them back to main thread
        alice.join();
        bob.join();

        System.out.println("Chat closed. Alice status: " + alice.isAlive());
    }
}