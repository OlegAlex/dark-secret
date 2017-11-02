package MP3_Players;

public abstract class MP3Player {
    String song = "The Best Song";
    private final double price;
    String[] playlist = new String[]{"The Best Song", "The Good Song", "The Super Song"};

    public MP3Player(double price) {
        this.price = price;
    }

    public String getSong() {
        return song;
    }

    public abstract void playSong();
}
