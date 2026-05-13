import java.util.*;

class Product {
    int id;
    String name;
    double price;

    // Constructor 1 (Parameterized)
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Constructor 2 (Scanner input)
    Product(Scanner sc) {
        while (true) {
            try {
                System.out.print("Enter product id: ");
                id = sc.nextInt();
                sc.nextLine(); 
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number in the ID section.");
                sc.nextLine(); 
            }
        }

        System.out.print("Enter product name: ");
        name = sc.nextLine();

        System.out.print("Enter product price: ");
        price = sc.nextDouble();
    }
}

class ecommerce {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();

        // Add products in a loop
        while (true) {
            System.out.println("\n--- Add Product #" + (cart.size() + 1) + " ---");
            cart.add(new Product(sc));
            sc.nextLine(); // clear buffer

            System.out.print("\nDo you want to add more products? (yes/no): ");
            String choice = sc.nextLine().trim().toLowerCase();
            if (choice.equals("no") || choice.equals("n")) {
                break;
            }
        }

        // Calculate total
        double total = 0;
        for (Product p : cart) {
            total += p.price;
        }

        double discount = 0;

        if (total > 50000) {
            discount = total * 0.10;
        } else if (total > 30000) {
            discount = total * 0.05;
        }

        double finalAmount = total - discount;

        // Display order summary
        System.out.println("\n===== Final Order =====");
        System.out.println("ID\tName\t\tPrice");

        for (Product p : cart) {
            System.out.println(p.id + "\t" + p.name + "\t\t" + p.price);
        }

        System.out.println("\nTotal Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}
