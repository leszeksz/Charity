package pl.coderslab.charity.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    String role;
    @ManyToMany(mappedBy = "role", fetch = FetchType.EAGER)
    List<User> users;
}
