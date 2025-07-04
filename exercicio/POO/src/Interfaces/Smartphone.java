package Interfaces;

public class Smartphone implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
        System.out.println("O smartphone esta tocando a musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone esta pausando a musica");
    }

    @Override
    public void StopMusic() {
        System.out.println("O smartphone esta parando a musica");
    }

    @Override
    public void playVideo() {
        System.out.println("O smartphone esta reproduzindo o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone esta pausando o video");
    }

    @Override
    public void StopVideo() {
        System.out.println("O smartphone esta parando o video");
    }
}
