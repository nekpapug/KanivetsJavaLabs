package laba3.controller;

import laba3.model.Department;
import laba3.model.Human;
import laba3.model.Group;

import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(String name, Human head, List<Group> groups) {
        return new Department(name, head);
    }
}
