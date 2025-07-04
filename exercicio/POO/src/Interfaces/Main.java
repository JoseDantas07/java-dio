package Interfaces;

public class Main {
    public static void main(String[] args) {
        runMusic(new Computer());
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}
