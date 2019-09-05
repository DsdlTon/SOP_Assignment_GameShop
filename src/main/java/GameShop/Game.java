package GameShop;

public abstract class Game {
    public abstract int getId();
    public abstract String getTitle();
    public abstract String getPlatform();
    public abstract String getGenre();
    public abstract double getPrice();

    @Override
    public String toString() {
        return "ID: " + String.valueOf(this.getId()) + ", Title: " + String.valueOf(this.getTitle()) + ", Genre: " +
                String.valueOf(this.getGenre()) + ", Platform: " + String.valueOf(this.getPlatform()) + ", Price: " +
                String.valueOf(this.getPrice());
    }
}
