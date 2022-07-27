package be.digitalcity.demointrospring.utils;

import be.digitalcity.demointrospring.entities.Player;
import be.digitalcity.demointrospring.services.PlayerService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class DataInit implements InitializingBean {

    private final PlayerService playerService;

    private List<Player> players = Arrays.asList(
            Player.builder()
                    .name("Hazard")
                    .birthdate(LocalDate.of(1995, 11, 2))
                    .number(7)
                    .poste(Poste.AVANT_GAUCHE)
                    .salary(150000.00)
                    .build(),
            Player.builder()
                    .name("De Bruyne")
                    .birthdate(LocalDate.of(1994, 7, 21))
                    .number(10)
                    .poste(Poste.AVANT_DROIT)
                    .salary(190000.00)
                    .build(),
            Player.builder()
                    .name("Meunier")
                    .birthdate(LocalDate.of(1990, 10, 5))
                    .number(14)
                    .poste(Poste.BACK_DROIT)
                    .salary(78000.00)
                    .build(),
            Player.builder()
                    .name("Courtois")
                    .birthdate(LocalDate.of(1998, 10, 20))
                    .number(1)
                    .poste(Poste.GARDIEN)
                    .salary(200000.00)
                    .build(),
            Player.builder()
                    .name("Lukaku")
                    .birthdate(LocalDate.of(1990, 12, 20))
                    .number(9)
                    .poste(Poste.AVANT_GAUCHE)
                    .salary(198000.00)
                    .build()
    );

    public DataInit(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.players.forEach(playerService::insert);
    }
}
