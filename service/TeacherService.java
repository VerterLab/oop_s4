package service;

import model.Teacher;

public class TeacherService {
    public Teacher createTeacher(int id, String name, String lastName) {
        return new Teacher(id, name, lastName);
    }

    public Teacher editTeacher(Teacher teacher) {
        teacher.setName("newName");
        teacher.setLastName("newLastName");
        return teacher;
    }

}
