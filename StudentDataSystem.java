import java.util.Scanner;

class Person {

    String name;
    int age;

    void getPersonData(String n, int a) {

        name = n;
        age = a;
    }

    void displayPersonData() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    int rollno;
    String course;

    void getStudentData(int r, String s) {

        rollno = r;
        course = s;
    }

    void displayStudentData() {

        System.out.println("Roll No: " + rollno);
        System.out.println("Course: " + course);
    }
}

public class StudentDataSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("Enter Personal Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.println("\nEnter Student Details:");
        System.out.print("Roll No: ");
        int rollno = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Course: ");
        String course = sc.nextLine();

        // Pass user inputs to the methods
        s.getPersonData(name, age);
        s.getStudentData(rollno, course);

        System.out.println("\n--- Final Student Data ---");
        s.displayPersonData();
        s.displayStudentData();

        sc.close();
    }
}
