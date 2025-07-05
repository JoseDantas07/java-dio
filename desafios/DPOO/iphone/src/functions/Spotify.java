package functions;

public class Spotify implements Music{
    @Override
    public String playMusic() {
        return "Tocando musica";
    }

    @Override
    public String pauseMusic() {
        return "Pausando musica";
    }

    @Override
    public String selectMusic() {
        return "Selecioando musica";
    }
}
