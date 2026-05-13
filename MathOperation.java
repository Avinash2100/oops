import java.util.Scanner;

class MathOperation {

    static int power(int a, int b) {

        return (int) Math.pow(a, b);
    }
    static double power(double a, double b) {

        return Math.pow(a, b);
    }
    static int abs(int a) {

        return Math.abs(a);
    }

    static double abs(double a) {

        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Power (int) ---");
        System.out.print("Enter base (int): ");
        int baseInt = sc.nextInt();
        System.out.print("Enter exponent (int): ");
        int expInt = sc.nextInt();
        System.out.println("Result: " + power(baseInt, expInt) + "\n");

        System.out.println("--- Power (double) ---");
        System.out.print("Enter base (double): ");
        double baseDouble = sc.nextDouble();
        System.out.print("Enter exponent (double): ");
        double expDouble = sc.nextDouble();
        System.out.println("Result: " + power(baseDouble, expDouble) + "\n");

        System.out.println("--- Absolute (int) ---");
        System.out.print("Enter an integer: ");
        int absInt = sc.nextInt();
        System.out.println("Result: " + abs(absInt) + "\n");

        System.out.println("--- Absolute (double) ---");
        System.out.print("Enter a double: ");
        double absDouble = sc.nextDouble();
        System.out.println("Result: " + abs(absDouble));

        sc.close();
    }
}
