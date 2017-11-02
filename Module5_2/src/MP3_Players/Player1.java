package MP3_Players;

public class Player1 extends MP3Player {
    public Player1(double price) {
        super(price);
    }

    public void playSong() {
        System.out.println("Playing: " + getSong());
    }
}
