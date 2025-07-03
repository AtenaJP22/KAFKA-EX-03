package com.example;

public class Student {
    private int id;
    private String name;

    public Student() {}  // Default constructor for Jackson

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // toString for pretty print
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}