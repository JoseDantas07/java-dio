package functions;

public class CarStatus {
    public static Marcha marcha = new Marcha();

    public static void ligado(){
       if (marcha.isPontoMorto()){
            var turnOn = true;
           System.out.println("ligou");
        }
    }
    public static void desligado(){
        var turnOff = false;
        System.out.println("desligou");
    }
}
