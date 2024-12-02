package laba3.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Human head;
    private List<Department> departments;

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Display faculty information
    public void displayFacultyInfo() {
        System.out.println("  Faculty: " + name);
        System.out.println("  Head: " + head.getFullName());
        for (Department department : departments) {
            department.displayDepartmentInfo();
        }
    }
}