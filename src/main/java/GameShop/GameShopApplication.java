package GameShop;

import GameShop.model.GameModel;
import GameShop.model.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController

public class GameShopApplication {
    @Autowired
    GameService gameService = new GameService();

    public static void main(String[] args) {
        SpringApplication.run(GameShopApplication.class, args);
    }

    @RequestMapping("/games")
    public List<GameModel> allGame() {
        return gameService.getAllGame();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<GameModel> getById(@PathVariable int id) {
        return gameService.getGameById(id);
    }

    //create
    @RequestMapping(value = "/createGame", method = RequestMethod.POST)
    public ResponseEntity<GameModel> createGame(@RequestBody GameModel game) {
        GameModel newGame = gameService.createGame(game);
        return ResponseEntity.status(HttpStatus.CREATED).body(gameService.createGame(newGame));
    }

    //update
    @RequestMapping(value = "/updateGame/{id}", method = RequestMethod.PUT)
    public Optional<GameModel> updateGame(@RequestBody GameModel game, @PathVariable int id) {
        return gameService.updateGame(id, game);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    String deleteGame(@PathVariable int id) {
        gameService.deleteGame(id);
        return "Delete id: " + id + "Successfully!!";
    }


}
