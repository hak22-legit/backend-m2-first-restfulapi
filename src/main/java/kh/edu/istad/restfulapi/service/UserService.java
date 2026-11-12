package kh.edu.istad.restfulapi.service;

import kh.edu.istad.restfulapi.dto.CreateUserRequest;
import kh.edu.istad.restfulapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    // your logic code

    List<User> getAll();

    User getById(UUID id);

    User createUser(CreateUserRequest createUserRequest);

    void deleteById(UUID id);



}
