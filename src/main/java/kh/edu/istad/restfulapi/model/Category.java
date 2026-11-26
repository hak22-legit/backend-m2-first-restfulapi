package kh.edu.istad.restfulapi.model;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 255)
    private String icon;

    @OneToMany(mappedBy = "category")
    private List<Product> product;
}
