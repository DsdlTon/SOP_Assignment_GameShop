package demo;

import java.util.*;

import GameShop.GameDetail;
import GameShop.GameMockedData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class GameShopApplication {
    GameMockedData game = GameMockedData.getInstance();

    public static void main(String[] args) {
        SpringApplication.run(GameShopApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

    @GetMapping("/games")
    public List<GameDetail> index() {
        return game.fetchGames();
    }

    @GetMapping("/games/{id}")
    public GameDetail show(@PathVariable String id) {
        int gameId = Integer.parseInt(id);
        return game.getGameById(gameId);
    }

    @PostMapping("/game")
    public GameDetail create(@RequestBody Map<String, String> body) {
        int id = Integer.parseInt(body.get("id"));
        String title = body.get("title");
        String genre = body.get("genre");
        String platform = body.get("platform");
        double price = Double.parseDouble(body.get("price"));
        return game.addGame(id, title, genre, platform, price);
    }

}
