interface Students {

    void display();
}

// Science Student Class
class ScienceStudent implements Students {

    public void display() {

        System.out.println("Science Student Marks: 85");
    }
}

// Commerce Student Class
class CommerceStudent implements Students {

    public void display() {

        System.out.println("Commerce Student Marks: 78");
    }
}

public class StudentInterface {

    public static void main(String[] args) {

        Students s;

        s = new ScienceStudent();

        s.display();

        s = new CommerceStudent();

        s.display();
    }
}
