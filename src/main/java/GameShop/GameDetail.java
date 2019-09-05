package GameShop;

public class GameDetail {
    private int id;
    private String title;
    private String genre;
    private String platform;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GameDetail() {}

    public GameDetail(int id, String title, String genre, String platform, double price) {
        this.setId(id);
        this.setTitle(title);
        this.setGenre(genre);
        this.setPlatform(platform);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return "GameDetail {" +
                "id: " + id +
                ", title: " + title +
                ", genre: " + genre +
                ", platform: " + platform +
                ", price: " + price + "Bath }";
    }
}
