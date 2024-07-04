package model;

public class Student extends User  {
// implements Comparable<Student>
    public Student(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;

    }

    @Override
    public String toString() {
        return String.format("Student [id = %d, name = %s, lastName = %s]", id, name, lastName);
    }

    // public Object comparator(Student o2) {
    //     return this.getId() - o2.getId();
    // }

    // @Override
    // public int compareTo(Student o) {
    //     return this.getId() - o.getId();
    // }

}
