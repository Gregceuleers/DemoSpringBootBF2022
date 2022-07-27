package be.digitalcity.demointrospring.entities;

import be.digitalcity.demointrospring.utils.Poste;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    String name;

    @Column(columnDefinition = "DATE")
    LocalDate birthdate;

    @Column
    int number;

    @Column
    double salary;

    @Column
    @Enumerated(EnumType.STRING)
    Poste poste;

}
