import functions.CarStatus;

import visual.Car;
import functions.Marcha;

public class Main{
    /// não conseguir terminar ainda vou estudar mais
    public static void main(String[] args) {
       Marcha marcha = new Marcha();

        for (int i = 0; i <= 5; i++){
            marcha.accelerate();
            marcha.verifyMarch();
        }


    }
}