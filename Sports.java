interface Sports {
    void play();
}

interface Academics {
    void study();
}

class Student implements Sports, Academics {

    public void play() {
        System.out.println("Student plays football");
    }

    public void study() {
        System.out.println("Student studies Java");
    }

    void display() {
        System.out.println("Student can participate in sports and academics");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Student s = new Student();

        s.display();
        s.play();
        s.study();
    }
}