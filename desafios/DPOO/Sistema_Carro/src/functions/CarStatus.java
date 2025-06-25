package functions;

public class CarStatus {
    public static March march = new March();

    public static void ligado(){
       if (march.isPontoMorto()){
           var turnOn = true;
           System.out.println("ligou");
           return;
        }
        System.out.println("O carro tem que esta no neutro");
    }
    public static void desligado(){
        var turnOff = false;
        System.out.println("desligou");
        return;
    }
}
