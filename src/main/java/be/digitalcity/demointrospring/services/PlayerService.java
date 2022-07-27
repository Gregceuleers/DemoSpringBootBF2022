package be.digitalcity.demointrospring.services;

import be.digitalcity.demointrospring.dto.PlayerDTO;
import be.digitalcity.demointrospring.entities.Player;
import be.digitalcity.demointrospring.mapper.Mapper;
import be.digitalcity.demointrospring.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService implements IService<Player, PlayerDTO, Long> {

    private final PlayerRepository playerRepository;

    private final Mapper mapper;

    public PlayerService(PlayerRepository playerRepository, Mapper mapper) {
        this.playerRepository = playerRepository;
        this.mapper = mapper;
    }


    @Override
    public List<PlayerDTO> getAll() {
        return this.playerRepository
                .findAll()
                .stream()
                .map(mapper::toPlayerDto)
                .collect(Collectors.toList());
    }

    @Override
    public PlayerDTO getById(Long id) {
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
    public PlayerDTO insert(Player entity) {
        if (entity != null) {
            Player newPlayer = this.playerRepository.save(entity);
            return this.mapper.toPlayerDto(newPlayer);
        } else {
            throw new RuntimeException("Attention, problème de validité des données !");
        }

    }
}
