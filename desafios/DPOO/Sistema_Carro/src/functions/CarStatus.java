package functions;

public class CarStatus {
    public static March march = new March();
    boolean turnOn;


    public void ligado() {
        if (march.isNeutral()) {
            turnOn = true;
            System.out.println("ligou");
        }
        System.out.println("O carro tem que esta no neutro");
    }

    public void desligado() {
        if (march.isNeutral() && march.isSpeedometer() == 0) {
            System.out.println("Desligando...");
        }else{
            System.out.println("O carro deve estar em ponto morto e com 0 de velocidade");
        }
    }

    public boolean isTurnOn() {
        return turnOn;
    }
}
