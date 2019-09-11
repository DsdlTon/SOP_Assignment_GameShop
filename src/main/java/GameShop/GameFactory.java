package GameShop;

import GameShop.model.GameModel;
import GameShop.model.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GameFactory {
    public static GameDetail createGame (int id, String title, String genre, String platform, double price) {
        return new GameDetail(id, title, genre, platform, price);
    }
}
