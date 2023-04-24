import java.util.*;

public class Student {
    String name;

    public Student(String name) {
        if (name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String name = scr.nextLine();
        String input = scr.nextLine();
        scr.close();
        
        Student student = new Student(name);
        System.out.println(student.name);
        
        if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Unknown");
        }
    }
}
