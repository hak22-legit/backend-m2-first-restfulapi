package kh.edu.istad.restfulapi.controller;



import kh.edu.istad.restfulapi.dto.CreateUserRequest;
import kh.edu.istad.restfulapi.model.User;
import kh.edu.istad.restfulapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable UUID id) {
        return userService.getById(id);
    }

    @PostMapping
    public User create(@RequestBody CreateUserRequest createUserRequest) {
        return userService.createUser(createUserRequest);
    }

    @DeleteMapping
    public void deleteById(
            @RequestParam UUID id
    ) {
        userService.deleteById(id);
    }

}
