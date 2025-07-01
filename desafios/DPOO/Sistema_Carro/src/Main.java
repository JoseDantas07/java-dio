import functions.CarStatus;
import functions.March;

import visual.Car;
import visual.Opcao;

import java.util.Scanner;

public class Main{

    /// falta coisas
    ///
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        March march = new March();
        Car car = new Car();
        CarStatus carStatus = new CarStatus();
        march.setCarStatus(carStatus);

        var option = -1;
        do {
            Opcao.carInterface();
            option =sc.nextInt();

            switch (option){
                case 1 ->{
                    carStatus.ligado();
                    car.visualCarCenter();
                }
                case 2 -> {
                    carStatus.desligado();
                    option = 0;
                }

                case 3 -> march.speedometer();

                case 4 -> march.brake();
                case 5 -> car.visualCarLeft();
                case 6 -> car.visualCarRight();
                case 7 -> march.getSpeedometer();
                case 8 -> {
                    if (carStatus.isTurnOn()){
                        System.out.println("[1] Aumentar");
                        System.out.println("[2] Diminui");
                        var marcha = sc.nextInt();
                        do {
                            if (marcha == 1){
                                march.increaseGear();
                                march.speedometer();
                                car.advanceCar();
                            } else if (marcha == 2) {
                                march.brake();
                                march.speedometer();
                                car.backCar();
                            }
                        } while (marcha != 1 && marcha != 2);
                    }else {
                        System.out.println("Tem que ligar o carro primeiro");
                    }
                }
                case 0 -> System.out.println("Desligando ...");
            }
        } while (option != 0);
    }
}