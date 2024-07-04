import java.util.List;

import controller.StudentController;
import controller.TeacherController;
import model.Student;
import model.Teacher;

/**
 * programT
 */
public class ProgramT {

    public static void main(String[] args) {
        new StudentController()
                .sendOnConsole(List.of(new Student(2,"Shasha","Petrovich"),
                new Student(1,"Tan", "Tanych"), new Student(3, "Jan", "Janych")));
        new TeacherController()
                .sendOnConsole(List.of(new Teacher( 666,"Lubov", "Petrovich"), new Teacher(222, "Elena", "Ivanovna")));   }
    
}
