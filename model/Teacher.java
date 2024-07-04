package model;

public class Teacher extends User {
// implements Comparable<Teacher>
    public Teacher(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Teacher [name = %s, lastName = %s, id = %d]", name, lastName, id);
    }

    // @Override
    // public int compareTo(Teacher o) {
    //     return this.id - o.id;
    // }
}
