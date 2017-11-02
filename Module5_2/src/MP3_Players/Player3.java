package MP3_Players;

public class Player3 extends MP3Player {
    public Player3(double price) {
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
}
