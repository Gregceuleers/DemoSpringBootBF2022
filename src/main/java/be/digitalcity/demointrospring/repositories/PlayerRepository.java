package be.digitalcity.demointrospring.repositories;

import be.digitalcity.demointrospring.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
