package laba3.controller;

import laba3.model.Group;
import laba3.model.Human;
import laba3.model.Student;

import java.util.List;

public class GroupCreator {
    public Group createGroup(String name, Human head, List<Student> students) {
        return new Group(name, head);
    }
}
