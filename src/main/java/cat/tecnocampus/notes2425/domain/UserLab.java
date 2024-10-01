package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "User_lab")
public record UserLab(
        @Id @GeneratedValue (strategy = GenerationType.IDENTITY)long id,
        @Column (nullable = false, unique = true)String username,
        @Column (nullable = false, unique = true) String email) {
}
