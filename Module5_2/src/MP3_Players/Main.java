package MP3_Players;

import MP3_Players.Advanced_Players.Player3;
import MP3_Players.Advanced_Players.Player4;
import MP3_Players.Advanced_Players.Player5;
import MP3_Players.Advanced_Players.Player6;
import MP3_Players.Simple_Players.Player1;
import MP3_Players.Simple_Players.Player2;

public class Main {
    public static void main(String[] args) {
        Player1 Player1 = new Player1(30);
        Player2 Player2 = new Player2(40);
        Player3 Player3 = new Player3(50);
        Player4 Player4 = new Player4(60);
        Player5 Player5 = new Player5(70);
        Player6 Player6 = new Player6(80);
        System.out.println("Плеер1");
        Player1.playSong();
        System.out.println("Плеер2");
        Player2.playSong();
        System.out.println("Плеер3");
        Player3.playSong();
        Player3.playAllSongs();
        System.out.println("Плеер4");
        Player4.playSong();
        Player4.playAllSongs();
        System.out.println("Плеер5");
        Player5.playSong();
        Player5.playAllSongs();
        System.out.println("Плеер6");
        Player6.playSong();
        Player6.shuffle();
        Player6.playAllSongs();

    }
}
