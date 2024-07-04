package controller;

import java.util.List;

import model.Student;
import model.User;
import view.StudentView;
import view.UserView;

public class StudentController implements UserController {

    private UserView<Student> studentView = new StudentView();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Student> students) {
        studentView.sendOnConsole(students);
    }
}
