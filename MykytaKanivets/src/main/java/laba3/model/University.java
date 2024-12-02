package laba3.model;

import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private Human head;
    private List<Faculty> faculties;

    public University(String name, Human head) {
        this.name = name;
        this.head = head;
        this.faculties = new ArrayList<>();
    }

    // Add a faculty to the university
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Optional method to display university information
    public void displayUniversityInfo() {
        System.out.println("University: " + name);
        System.out.println("Head: " + head.getFullName());
        for (Faculty faculty : faculties) {
            faculty.displayFacultyInfo();
        }
    }
}

