package laba3.controller;

import laba3.model.University;
import laba3.model.Human;
import laba3.model.Faculty;

import java.util.List;

public class UniversityCreator {
    public University createUniversity(String name, Human head, List<Faculty> faculties) {
        return new University(name, head);
    }
}
