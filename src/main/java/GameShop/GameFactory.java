package GameShop;

public class GameFactory {
    public static GameDetail createGame (int id, String title, String genre, String platform, double price) {
        return new GameDetail(id, title, genre, platform, price);
    }
}
