package laba4.controller;

import laba4.model.Student;
import laba4.model.Sex;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String middleName, Sex sex) {
        return new Student(firstName, lastName, middleName, sex);
    }
}