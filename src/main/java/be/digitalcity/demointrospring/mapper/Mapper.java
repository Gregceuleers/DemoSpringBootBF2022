package be.digitalcity.demointrospring.mapper;

import be.digitalcity.demointrospring.dto.PlayerDTO;
import be.digitalcity.demointrospring.entities.Player;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class Mapper {

    public PlayerDTO toPlayerDto(Player entity) {

        return PlayerDTO.builder()
                .id(entity.getId())
                .birthdate(entity.getBirthdate())
                .name(entity.getName())
                .number(entity.getNumber())
                .poste(entity.getPoste())
                .salary(entity.getSalary())
                .age(Period.between(LocalDate.now(), entity.getBirthdate()).getYears())
                .build();
    }

    public Player toPlayerEntity(PlayerDTO dto) {
        return null;
    }

}
