import laba4.JsonManager;
import laba4.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityTest {

    @Test
    public void testUniversitySerializationAndDeserialization() {

        University oldUniversity = createTypicalUniversity();


        String filePath = "university.json";
        JsonManager jsonManager = new JsonManager();
        try {
            jsonManager.writeToJson(oldUniversity, filePath);

            jsonManager.displayJsonFromFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            assert false : "Error, while writing to file: " + e.getMessage();
        }


        University newUniversity;
        try {
            newUniversity = jsonManager.readFromJson(filePath, University.class);
        } catch (IOException e) {
            e.printStackTrace();
            assert false : "Error, while reading from file: " + e.getMessage();
            return;
        }


        assertEquals(oldUniversity, newUniversity, "Университеты должны быть эквивалентны после сериализации и десериализации");
    }


    private University createTypicalUniversity() {

        Human universityHead = new Human("Alice", "Liddle", "Smith", Sex.MALE);
        University university = new University("NTU", universityHead);


        Human facultyHead1 = new Human("Lewis", "Carrol", "Kate", Sex.FEMALE);
        Faculty faculty1 = new Faculty("engineering", facultyHead1);

        Human facultyHead2 = new Human("Bob", "Williams", "James", Sex.MALE);
        Faculty faculty2 = new Faculty("mathematics", facultyHead2);

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);


        addDepartmentsToFaculty(faculty1);
        addDepartmentsToFaculty(faculty2);

        return university;
    }

    private void addDepartmentsToFaculty(Faculty faculty) {

        for (int i = 0; i < 2; i++) {
            Human deptHead = new Human("DeptHead" + (i + 1), "LastName" + (i + 1), "Patronymic" + (i + 1), Sex.MALE);
            Department department = new Department("Department " + (i + 1), deptHead);
            faculty.addDepartment(department);
            addGroupsToDepartment(department);
        }
    }

    private void addGroupsToDepartment(Department department) {

        for (int i = 0; i < 2; i++) {
            Human groupHead = new Human("GroupHead" + (i + 1), "LastName" + (i + 1), "Patronymic" + (i + 1), Sex.MALE);
            Group group = new Group("Group " + (i + 1), groupHead);
            department.addGroup(group);
            addStudentsToGroup(group);
        }
    }

    private void addStudentsToGroup(Group group) {

        for (int i = 0; i < 2; i++) {
            Student student = new Student("Student" + (i + 1), "LastName" + (i + 1), "Patronymic" + (i + 1), Sex.MALE);
            group.addStudent(student);
        }
    }
}
