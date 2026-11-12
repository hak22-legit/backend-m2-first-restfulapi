package kh.edu.istad.restfulapi.dto;

public record CreateUserRequest(
    String name,
    String username,
    String password
) {

}
