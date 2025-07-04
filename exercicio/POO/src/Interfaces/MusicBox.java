package Interfaces;

public class MusicBox implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("A caixa de musica esta tocando a musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de musica esta pausando a musica");
    }

    @Override
    public void StopMusic() {
        System.out.println("A caixa de musica esta parando a musica");
    }
}
