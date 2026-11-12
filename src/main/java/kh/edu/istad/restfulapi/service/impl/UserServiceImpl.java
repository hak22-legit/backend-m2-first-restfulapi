package kh.edu.istad.restfulapi.service.impl;

import kh.edu.istad.restfulapi.dto.CreateUserRequest;
import kh.edu.istad.restfulapi.model.User;
import kh.edu.istad.restfulapi.repository.UserRepository;
import kh.edu.istad.restfulapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.selectAll();
    }


    @Override
    public User getById(UUID id) {
        return userRepository.selectById(id)
                .orElseThrow();
    }

    @Override
    public User createUser(CreateUserRequest  createUserRequest) {
        User newUser = new User();
        newUser.setId(UUID.randomUUID());
        newUser.setName(createUserRequest.name());
        newUser.setUsername(createUserRequest.username());
        newUser.setPassword(createUserRequest.password());
        newUser.setIsActive(true);
        return newUser;
    }

    @Override
    public void deleteById(UUID id) {
         userRepository.selectAll().removeIf(u -> u.getId().equals(id));
    }
}
