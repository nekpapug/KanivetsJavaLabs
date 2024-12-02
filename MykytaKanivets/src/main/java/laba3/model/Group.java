package laba3.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Human head;
    private List<Student> students;

    public Group(String name, Human head) {
        this.name = name;
        this.head = head;
        this.students = new ArrayList<>();
    }

    // Add a student to the group
    public void addStudent(Student student) {
        students.add(student);
    }
    public void displayGroupInfo() {
        System.out.println("      Group: " + name);
        System.out.println("      Head: " + head.getFullName());
        for (Student student : students) {
            System.out.println("        Student: " + student.getFullName());
        }
    }
}

