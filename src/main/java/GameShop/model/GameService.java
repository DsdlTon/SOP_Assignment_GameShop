package GameShop.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameModel> getAllGame() {
        return (List<GameModel>) gameRepository.findAll();
    }

    public Optional<GameModel> getGameById(int id) {
        return gameRepository.findById(id);
    }

    public GameModel createGame(GameModel game) {
        return gameRepository.save(game);
    }

    public Optional<GameModel> updateGame(int id, GameModel game) {
        Optional<GameModel> gameOptional = gameRepository.findById(id);
        if(!gameOptional.isPresent()) {
            return gameOptional;
        }
        game.setId(id);
        return Optional.of(gameRepository.save(game));
    }

    public void deleteGame(int id) {
        gameRepository.deleteById(id);
    }
}
