package laba4;

import laba4.model.*;
import laba4.controller.*;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Human universityHead = new Human("Lewis", "Carrol", "Smith", Sex.MALE);
        University university = universityCreator.createUniversity("NTU", universityHead);

        Human facultyHead = new Human("Alice", "Liddle", "", Sex.FEMALE);
        Faculty faculty = facultyCreator.createFaculty("programming", facultyHead);
        university.addFaculty(faculty);

        Human departmentHead = new Human("Linda", "Green", "", Sex.FEMALE);
        Department department = new Department("computer science", departmentHead);
        faculty.addDepartment(department);

        Human groupHead = new Human("Taylor", "Swift", "James", Sex.MALE);
        Group group = groupCreator.createGroup("some group", groupHead);
        department.addGroup(group);

        Student student1 = studentCreator.createStudent("Tom", "Hardey", "Lee", Sex.MALE);
        group.addStudent(student1);

        Student student2 = studentCreator.createStudent("Emily", "Davis", "Ruth", Sex.FEMALE);
        group.addStudent(student2);

        university.displayUniversityInfo();
    }
}