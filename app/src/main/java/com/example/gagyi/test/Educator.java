package com.example.gagyi.test;

import java.util.List;

/**
 * Created by gagyi on 2017-10-30.
 */

public class Educator {

    public String firstName;
    public String lastName;
    public List<User> children;

    public Educator(String firstName, String lastName, List<User> children) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.children = children;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<User> getChildren() {
        return children;
    }

    public void setChildren(List<User> children) {
        this.children = children;
    }
}
