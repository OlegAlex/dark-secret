package MP3_Players;

public class Player5 extends MP3Player {

    public Player5(double price) {
        super(price);
    }

    public void playSong() {
        System.out.println("Playing: " + playlist[0]);
    }

    public void playAllSongs() {
        int i = playlist.length;
        while (i != 0) {
            System.out.println("Playing: " + playlist[i - 1]);
            i--;
        }


    }
}
