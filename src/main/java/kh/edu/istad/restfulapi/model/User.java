package kh.edu.istad.restfulapi.model;


import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    private UUID id;
    private String name;
    private String username;
    private String password;
    private Boolean isActive;



}
