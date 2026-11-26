package kh.edu.istad.restfulapi.service;

import kh.edu.istad.restfulapi.dto.CreateUserRequest;
import kh.edu.istad.restfulapi.dto.UserResponse;
import kh.edu.istad.restfulapi.model.User;
import kh.edu.istad.restfulapi.repository.UserRepository;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface UserService {

    // your logic code

    List<UserResponse> getAll();

    UserResponse getById(UUID id);

    UserResponse createUser(CreateUserRequest createUserRequest);

    void deleteById(UUID id);


    // PageNumber is the page number to retrieve
    // PageSize is the number of
    Page<UserResponse> getAllWithPaging(int pageNumber, int pageSize);



}
