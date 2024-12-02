package laba3.controller;

import laba3.model.Faculty;
import laba3.model.Human;
import laba3.model.Department;

import java.util.List;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head, List<Department> departments) {
        return new Faculty(name, head);
    }
}
