package be.digitalcity.demointrospring.services;

import be.digitalcity.demointrospring.entities.Player;
import be.digitalcity.demointrospring.mapper.Mapper;
import be.digitalcity.demointrospring.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService implements IService<Player, Long> {

    private final PlayerRepository playerRepository;

    private final Mapper mapper;

    public PlayerService(PlayerRepository playerRepository, Mapper mapper) {
        this.playerRepository = playerRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Player> getAll() {
        return null;
    }

    @Override
    public Player getById(Long id) {
        return null;
    }

    @Override
    public boolean update(Long id, Player entity) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public Player insert(Player entity) {
        return null;
    }
}
