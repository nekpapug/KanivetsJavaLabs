package laba4.controller;

import laba4.model.Faculty;
import laba4.model.Human;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
