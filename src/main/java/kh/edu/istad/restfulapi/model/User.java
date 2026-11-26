package kh.edu.istad.restfulapi.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean isActive;

    @OneToOne(mappedBy = "user")
    private Customer customer;

}
