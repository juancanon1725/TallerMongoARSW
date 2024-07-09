package com.example;

import com.example.StudentUser;
import com.example.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * REST controller for managing user registrations.
 */
@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private StudentRepository repository;

    /**
     * Retrieves all users from the repository.
     * @return A list of StudentUser objects.
     */
    @GetMapping
    public List<StudentUser> getAllUsers() {
        return repository.findAll();
    }

    /**
     * Adds a new user to the repository.
     * @param user The user to be added.
     * @return The added StudentUser object.
     */
    @PostMapping
    public StudentUser addUser(@RequestBody StudentUser user) {
        return repository.save(user);
    }
}