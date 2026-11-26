package kh.edu.istad.restfulapi.repository;

import kh.edu.istad.restfulapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;


public interface UserRepository extends JpaRepository <User, UUID> {


    List<User> id(UUID id);
}





