import java.util.*;

public class Order {

    public static void main(String args[]) {

        int n;
        int count = 0;
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        n = sc.nextInt();

        // Array created AFTER taking size
        int arr[] = new int[n];

        int sum = 0;

        System.out.println("Enter array elements:");

        for (i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            sum = sum + arr[i];
        }

        while (true) {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Display Elements");
            System.out.println("2. Display Sum and Average");
            System.out.println("3. Search an Element");
            System.out.println("4. Find Maximum and Minimum");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Elements are:");
                    for (i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    double avg = (double) sum / n;
                    System.out.println("Sum: " + sum);
                    System.out.println("Average: " + avg);
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int s = sc.nextInt();
                    count = 0;
                    for (i = 0; i < n; i++) {
                        if (arr[i] == s) {
                            System.out.println("Element found at index: " + i);
                            count = 1;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Element not found");
                    }
                    break;

                case 4:
                    int max = arr[0];
                    int min = arr[0];
                    for (i = 0; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Maximum element: " + max);
                    System.out.println("Minimum element: " + min);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return; // Exit main method

                default:
                    System.out.println("Invalid choice! Please select between 1 and 5.");
            }
        }
    }
}
