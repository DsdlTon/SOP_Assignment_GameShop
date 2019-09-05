package GameShop;

import java.util.ArrayList;
import java.util.List;

public class GameMockedData {
    private List<GameDetail> games;
    private static GameMockedData instance = null;
    public static GameMockedData getInstance() {
        if (instance == null) {
            instance = new GameMockedData();
        }
        return instance;
    }

    public GameMockedData() {
        games = new ArrayList<GameDetail>();
        games.add(GameFactory.createGame(1, "Control", "TPS", "PC, PS4", 1280));
        games.add(GameFactory.createGame(2, "Red Dead Redemption 2", "West, Cowboy, TPS, Action", "PS4", 1890));
        games.add(GameFactory.createGame(3, "Super Mario Odyssey", "Adventure, Cute, Pussle", "Nintendo Switch", 1200));
        games.add(GameFactory.createGame(4, "The Witcher 3", "Dark Fantasy, Action, Adventure", "PC, PS4, Nintendo Switch", 1690));
        games.add(GameFactory.createGame(5, "Arena of Valor", "Moba", "Android, IOS", 0));
    }

    public List<GameDetail> fetchGames() {
        return games;
    }

    public GameDetail getGameById(int id) {
        for (GameDetail g: games) {
            if (g.getId() == id) {
                return g;
            }
        }
        return null;
    }

    public GameDetail addGame(int id, String title, String genre, String platform, double price) {
        GameDetail addGame = new GameDetail(id, title, genre, platform, price);
        games.add(addGame);
        return addGame;
    }
}


