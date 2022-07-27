package be.digitalcity.demointrospring.dto;

import be.digitalcity.demointrospring.utils.Poste;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDTO {

    Long id;

    String name;

    LocalDate birthdate;

    int age;

    int number;

    double salary;

    Poste poste;


}
