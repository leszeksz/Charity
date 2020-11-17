package pl.coderslab.charity.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    Integer quantity;
    @ManyToMany
    List<Category> categories = new ArrayList<>();
    @ManyToOne
    Institution institution;
    String street;
    String city;
    String zipCode;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate pickUpDate;
    LocalTime pickUpTime;
    String pickUpComment;
    String phone;

}