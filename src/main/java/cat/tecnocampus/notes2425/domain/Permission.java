package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Permission")
public record Permission(
        @Id @ManyToOne @JoinColumn(name = "user_id") UserLab owner,
        @Id @ManyToOne @JoinColumn (name = "note_id")Note note,
        @NotNull boolean canRead,
        @NotNull boolean canEdit) {
}
