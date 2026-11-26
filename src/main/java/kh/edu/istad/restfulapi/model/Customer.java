package kh.edu.istad.restfulapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    private UUID id;

    @Column(unique = true, length = 12, nullable = false)
    private String phoneNumber;

    private String address;

    @Column(nullable = false, unique = true, length = 60)
    private String email;

    @Column(nullable = false)
    private Boolean isDeleted;

    @OneToOne
    private User user;

}
