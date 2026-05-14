
import java.util.*;

class MathOperation {

    // Power method for int
    static int power(int a, int b) {

        return (int)Math.pow(a, b);
    }

    // Power method for double
    static double power(double a, double b) {

        return Math.pow(a, b);
    }

    // Absolute method for int
    static int abs(int a) {

        return Math.abs(a);
    }

    // Absolute method for double
    static double abs(double a) {

        return Math.abs(a);
    }

    public static void main(String[] args) {

        // Calling methods directly
        System.out.println("Power (int): " + power(2, 3));

        System.out.println("Power (double): " + power(2.5, 2.0));

        System.out.println("Absolute (int): " + abs(-10));

        System.out.println("Absolute (double): " + abs(-15.5));
    }
}
