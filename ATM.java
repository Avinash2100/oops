import java.util.*;

class A {

    void atm_operation() {

        int amt = 5000;
        int wamt, damt;
        int ch;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("\nChoose the following option:");
            System.out.println("1: Withdrawal");
            System.out.println("2: Deposit");
            System.out.println("3: Check Balance");
            System.out.println("4: Exit"); 

            ch = sc.nextInt();

            switch (ch) {

                case 1:

                    try {

                        System.out.println("Enter the withdrawal amount:");

                        wamt = sc.nextInt();

                        if (wamt <= 0) {

                            throw new IllegalArgumentException("Invalid amount");
                        }

                        if (wamt > amt) {

                            throw new ArithmeticException("Insufficient Balance");
                        }

                        amt = amt - wamt;

                        System.out.println("Withdrawal successful");
                    }

                    catch (InputMismatchException e) {

                        System.out.println("Please enter a valid number");

                        sc.next();
                    }

                    catch (ArithmeticException | IllegalArgumentException e) {

                        System.out.println("Error: " + e.getMessage());
                    }

                    break;

                case 2:

                    try {

                        System.out.println("Enter the deposit amount:");

                        damt = sc.nextInt();

                        if (damt <= 0) {

                            throw new IllegalArgumentException("Invalid deposit amount");
                        }

                        amt = amt + damt;

                        System.out.println("Deposit successful");
                    }

                    catch (InputMismatchException e) {

                        System.out.println("Please enter a valid number");

                        sc.next();
                    }

                    catch (IllegalArgumentException e) {

                        System.out.println("Error: " + e.getMessage());
                    }

                    break;

                case 3:

                    System.out.println("Available Balance: " + amt);

                    break;

                case 4:

                    System.out.println("Thank you for using ATM");

                    break;

                default:

                    System.out.println("Invalid choice. Please select again.");
            }

        } while (ch != 4);

        sc.close();
    }
}

public class ATM {

    public static void main(String[] args) {

        A obj = new A();

        obj.atm_operation();
    }
}
