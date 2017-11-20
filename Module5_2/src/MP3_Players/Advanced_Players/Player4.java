package MP3_Players.Advanced_Players;

public class Player4 extends MP3Player {

    public Player4(double price) {
        super(price);
    }

    public void playSong() {
        song = playlist[2];
        System.out.println("Playing: " + playlist[2]);
    }

    public void playAllSongs() {
        int i;
        for (i = 0; i < playlist.length; i++) {
            System.out.println("Playing: " + playlist[i]);
        }
    }
}
