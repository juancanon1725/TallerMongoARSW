package com.example;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 * Repository interface for performing CRUD operations on StudentUser documents in MongoDB.
 */
public interface StudentRepository extends MongoRepository<StudentUser, String> {

    /**
     * Finds a user by their name.
     * @param name The name of the user.
     * @return A StudentUser object with the specified name.
     */
    public StudentUser findByName(String name);

    /**
     * Finds users by their program.
     * @param program The program in which the users are enrolled.
     * @return A list of StudentUser objects with the specified program.
     */
    public List<StudentUser> findByProgram(String program);

}
