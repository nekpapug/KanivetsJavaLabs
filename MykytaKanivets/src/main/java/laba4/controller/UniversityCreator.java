package laba4.controller;

import laba4.model.University;
import laba4.model.Human;

public class UniversityCreator {
    public University createUniversity(String name, Human head) {
        return new University(name, head);
    }
}
