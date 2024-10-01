package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Set;

@Entity (name = "Note")
@Table (name = "note")
public record Note(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id,
        @ManyToOne UserLab owner,
        @NotNull String title,
        @NotNull String content,
        @CreatedDate @Column(nullable = false, updatable = false)LocalDateTime creationDate,
        @ManyToMany @JoinTable(
                name = "note_tag",
                joinColumns = @JoinColumn(name = "note_id"),
                inverseJoinColumns = @JoinColumn(name = "tag_name")
        ) Set<Tag> tags ) {
}
