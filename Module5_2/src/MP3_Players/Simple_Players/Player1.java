package MP3_Players.Simple_Players;

import MP3_Players.Advanced_Players.MP3Player;

public class Player1 extends MP3Player {
    public Player1(double price) {
        super(price);
    }

    public void playSong() {
        System.out.println("Playing: " + getSong());
    }
}
