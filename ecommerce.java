import java.util.*;

class Product {

    int id;
    String name;
    double price;

    // Constructor 1
    Product(int id, String name, double price) {

        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Constructor 2
    Product(Scanner sc) {

        System.out.print("Enter product id: ");

        id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter product name: ");

        name = sc.nextLine();

        System.out.print("Enter product price: ");

        price = sc.nextDouble();
    }
}

public class Order {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create objects
        Product p1 = new Product(966, "CPU", 7000);

        Product p2 = new Product(sc);

        Product p3 = new Product(sc);

        // Calculate total
        double total = p1.price + p2.price + p3.price;

        double discount = 0;

        // Discount condition
        if (total > 50000) {

            discount = total * 0.10;
        }

        else if (total > 30000) {

            discount = total * 0.05;
        }

        // Final amount
        double finalAmount = total - discount;

        // Display output
        System.out.println("\nFinal Order");

        System.out.println("ID\tName\t\tPrice");

        System.out.println(p1.id + "\t" + p1.name + "\t\t" + p1.price);

        System.out.println(p2.id + "\t" + p2.name + "\t\t" + p2.price);

        System.out.println(p3.id + "\t" + p3.name + "\t\t" + p3.price);

        System.out.println("\nTotal Amount: " + total);

        System.out.println("Discount: " + discount);

        System.out.println("Final Amount: " + finalAmount);
    }
}
