package laba3.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Human head;
    private List<Group> groups;

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
        this.groups = new ArrayList<>();
    }

    // Add a group to the department
    public void addGroup(Group group) {
        groups.add(group);
    }
    public void displayDepartmentInfo() {
        System.out.println("    Department: " + name);
        System.out.println("    Head: " + head.getFullName());
        for (Group group : groups) {
            group.displayGroupInfo();
        }
    }
}
