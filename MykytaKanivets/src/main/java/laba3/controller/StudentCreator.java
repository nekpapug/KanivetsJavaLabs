package laba3.controller;

import laba3.model.Student;
import laba3.model.Sex;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String middleName, Sex gender) {
        return new Student(firstName, lastName, middleName, gender);
    }
}
