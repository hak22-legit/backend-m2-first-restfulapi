package kh.edu.istad.restfulapi.repository;


import kh.edu.istad.restfulapi.dto.CreateUserRequest;
import kh.edu.istad.restfulapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepository {

    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
        User userAdmin = new User(UUID.randomUUID(), "Admin", "hak", "1234", true);
        User userManager = new User(UUID.randomUUID(), "Manager", "hakCG", "1234m", true);
        User userCO = new User(UUID.randomUUID(), "CO", "hak-23fck", "1234cg", true);
        users.add(userAdmin);
        users.add(userManager);
        users.add(userCO);
    }

    public List<User> selectAll() {
        return users;
    }

    public Optional<User> selectById(UUID id) {
        return  users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }


 public void insetUser(User user) {
     users.add(user);
 }




}
