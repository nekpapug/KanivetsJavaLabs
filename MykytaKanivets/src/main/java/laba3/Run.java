package laba3;

import java.util.List;
import java.util.ArrayList;

import laba3.controller.*;
import laba3.model.*;

public class Run {
    public static void main(String[] args) {

        List<Faculty> faculties = new ArrayList<>();
        List<Department> departments = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        UniversityCreator universityCreator = new UniversityCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Human universityHead = new Human("John", "Doe", "Smith", Sex.MALE);
        University university = universityCreator.createUniversity("My University", universityHead, faculties);

        Human facultyHead = new Human("Marry", "Sue", " ", Sex.FEMALE);
        Faculty faculty = facultyCreator.createFaculty("Engineering", facultyHead, departments);
        university.addFaculty(faculty);

        Human departmentHead = new Human("Lewis", "Carrol", " ", Sex.FEMALE);
        Department department = new Department("Computer Science", departmentHead);
        faculty.addDepartment(department);

        Human groupHead = new Human("Alice", "Liddle", " ", Sex.MALE);
        Group group = groupCreator.createGroup("Group A", groupHead, students);
        department.addGroup(group);

        Student student1 = studentCreator.createStudent("Tom", "Brown", "Lee", Sex.MALE);
        group.addStudent(student1);

        Student student2 = studentCreator.createStudent("Emily", "Davis", "Ruth", Sex.FEMALE);
        group.addStudent(student2);

        // Виводимо структуру університету
        university.displayUniversityInfo();
    }
}
