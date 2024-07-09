package com.example;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

/**
 * Represents a student user in the system.
 * This class is mapped to the "users" collection in MongoDB.
 */
@Document(collection = "users")
public class StudentUser {

    @Id
    private String email;
    private String name;
    private Date birthdate;
    private String program;

    /**
     * Default constructor for creating an empty StudentUser object.
     */
    public StudentUser() {}

    /**
     * Parameterized constructor for creating a StudentUser object with specified details.
     * @param email The email address of the student.
     * @param name The name of the student.
     * @param birthdate The birthdate of the student.
     * @param program The program in which the student is enrolled.
     */
    public StudentUser(String email, String name, Date birthdate, String program) {
        this.email = email;
        this.name = name;
        this.birthdate = birthdate;
        this.program = program;
    }

    /**
     * Gets the email address of the student.
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the student.
     * @param email The email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the name of the student.
     * @return The name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     * @param name The name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the birthdate of the student.
     * @return The birthdate.
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the birthdate of the student.
     * @param birthdate The birthdate.
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Gets the program in which the student is enrolled.
     * @return The program.
     */
    public String getProgram() {
        return program;
    }

    /**
     * Sets the program in which the student is enrolled.
     * @param program The program.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Returns a string representation of the StudentUser object.
     * @return A string representation of the student details.
     */
    @Override
    public String toString() {
        return String.format(
                "StudentUser[email='%s', name='%s', birthdate=%s, program='%s']",
                email, name, birthdate, program);
    }
}
