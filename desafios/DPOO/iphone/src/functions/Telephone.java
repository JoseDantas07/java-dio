package functions;

public class Telephone implements Call {
    @Override
    public String toCall() {
        return "Ligando";
    }

    @Override
    public String toMeet() {
        return "Atender a ligação";
    }

    @Override
    public String startVoiceMail() {
        return "Iniciando o correio de voz";
    }
}
