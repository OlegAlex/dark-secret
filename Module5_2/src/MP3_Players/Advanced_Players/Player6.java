package MP3_Players.Advanced_Players;

import java.util.Random;

public class Player6 extends MP3Player {
    public Player6(double price) {
        super(price);
    }

    public void playSong() {
        System.out.println("Playing: " + playlist[0]);
    }

    public void playAllSongs() {
        int i;
        for (i = 0; i < playlist.length; i++) {
            System.out.println("Playing: " + playlist[i]);
        }
    }

    public void shuffle() {
        Random rnd = new Random();
        for (int i = 0; i < playlist.length; i++) {
            int randomPosition = rnd.nextInt(playlist.length);
            String temp = playlist[i];
            playlist[i] = playlist[randomPosition];
            playlist[randomPosition] = temp;
        }
    }
}
