package functions;

public class CarStatus {
    public static Marcha marcha = new Marcha();

    public static boolean ligado(){
        var turnOn = true;
        return turnOn;
    }
    public static boolean desligado(){
        var turnOff = false;
        return turnOff;
    }
}
