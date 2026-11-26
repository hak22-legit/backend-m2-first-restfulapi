package kh.edu.istad.restfulapi.mapper;


import kh.edu.istad.restfulapi.dto.UserResponse;
import kh.edu.istad.restfulapi.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    // What is source?
    // What is target?

    UserResponse mapUserToUserResponse(User user);

}
