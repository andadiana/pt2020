import controller.Controller;
import model.Student;
import util.EmailValidator;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // Assemble all the components of the MVC
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Ion Popescu", 20));
        students.add(new Student("Maria Ionescu", 19));
        students.add(new Student("Ana Pop", 21));
        View v = new View("Example");
        Controller c = new Controller(students, v);

        // Regex example
        String email = "john@mail.com";
        String notEmail = "john@.com";

        // First validate the emails
        EmailValidator validator = new EmailValidator();
        System.out.println("Is " + email + " valid? --> " + validator.validate(email));
        System.out.println("Is " + notEmail + " valid? --> " + validator.validate(notEmail));

        // Now parse and print components of email
        validator.parseAndPrint(email);
    }
}
