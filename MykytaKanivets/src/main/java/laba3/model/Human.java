package laba3.model;

public class Human {
    private String firstName;
    private String lastName;
    private String middleName;
    private Sex gender;

    public Human(String firstName, String lastName, String middleName, Sex gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
    }

    // Method to return the full name
    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Sex getGender() {
        return gender;
    }
}