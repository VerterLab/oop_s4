package model;

import util.UserComparator;

public abstract class User extends UserComparator<User>{

    // public int id;
    // protected String name;
    // protected String lastName;
    public int id;
    public String name;
    public String lastName;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
