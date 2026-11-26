package kh.edu.istad.restfulapi.dto;

public record UserResponse(
        String id,
        String name,
        String isActive
) {
}
