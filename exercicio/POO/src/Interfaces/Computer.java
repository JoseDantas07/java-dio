package Interfaces;

public class Computer implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
        System.out.println("O computer esta tocando a musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computer esta pausando a musica");
    }

    @Override
    public void StopMusic() {
        System.out.println("O computer esta parando a musica");
    }

    @Override
    public void playVideo() {
        System.out.println("O computer esta reproduzindo o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computer esta pausando o video");
    }

    @Override
    public void StopVideo() {
        System.out.println("O computer esta parando o video");
    }
}
