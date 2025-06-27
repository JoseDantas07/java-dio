package functions;

import java.util.Scanner;

public class March {
    public Scanner sc = new Scanner(System.in);
    public CarStatus carStatus = new CarStatus();
    private boolean neutral = true;
    private boolean march01;
    private boolean march02;
    private boolean march03;
    private boolean march04;
    private boolean march05;
    private boolean march06;
    private int speedometer = 0;

    private int counter = 0;

    public void setCarStatus(CarStatus carStatus){
        this.carStatus = carStatus;
    }

    public void increaseGear(){
          this.counter++;
          verifyMarch();
    }
    public void brake(){
        this.counter--;
        if (counter < 0 ){
            ++counter;
        }
        verifyMarch();
    }

    public void verifyMarch() {
        if(counter == 0 ){
            onPontoMorto();

            offMarch01();
            System.out.println("ponto morto");

        }else if (counter == 1){
            offPontoMorto();

            onMarch01();

            offMarch02();
            System.out.println("Marcha 01");
        } else if (counter == 2){
            offMarch01();

            onMarch02();

            offMarch03();
            System.out.println("Marcha 02");
        }else if (counter == 3){
            offMarch02();

            onMarch03();

            offMarch04();
            System.out.println("Marcha 03");
        }else if (counter == 4){
            offMarch03();

            onMarch04();

            offMarch05();
            System.out.println("Marcha 04");
        }else if (counter == 5){
            offMarch04();

            onMarch05();

            offMarch06();
            System.out.println("Marcha 05");
        }else if (counter == 6){
            offMarch05();

            onMarch06();
            System.out.println("Marcha 06");
        }
    }

    public void onPontoMorto() {
        this.neutral = true;
    }

    public void onMarch01() {
        this.march01 = true;
    }

    public void onMarch02() {
        this.march02 = true;
    }

    public void onMarch03() {
        this.march03 = true;
    }

    public void onMarch04() {
        this.march04 = true;
    }

    public void onMarch05() {
        this.march05 = true;
    }

    public void onMarch06() {
        this.march06 = true;
    }

    public void offPontoMorto() {
        this.neutral = false;
    }

    public void offMarch01() {
        this.march01 = false;
    }

    public void offMarch02() {
        this.march02 = false;
    }

    public void offMarch03() {
        this.march03 = false;
    }

    public void offMarch04() {
        this.march04 = false;
    }

    public void offMarch05() {
        this.march05 = false;
    }

    public void offMarch06() {
        this.march06 = false;
    }

    public boolean isNeutral() {
        return this.neutral;
    }
    public int isSpeedometer(){
        return this.speedometer;
    }

    public void speedometer(){
        if (counter == 0){
            System.out.println("Troca para a primeira marcha para aumentar a velocidade");
        }
        if (carStatus.turnOn){
            if (counter == 1) {
                do {
                    System.out.println("Na marcha 1 so pode ir de 0 ate 20km/h");
                    speedometer = sc.nextInt();
                }while (speedometer < 0 || speedometer > 20);
            } else if (counter == 2){
                do {
                    System.out.println("Na marcha 2 so pode ir de 21 ate 40km/h");
                    speedometer = sc.nextInt();
                }while ( speedometer < 21 || speedometer > 40);
            } else if (counter == 3){
                do {
                    System.out.println("Na marcha 3 so pode ir de 41 ate 60km/h");
                    speedometer = sc.nextInt();
                }while ( speedometer < 41 || speedometer > 60);
            } else if (counter == 4){
                do {
                    System.out.println("Na marcha 4 so pode ir de 61 ate 80km/h");
                    speedometer = sc.nextInt();
                }while ( speedometer < 61 || speedometer > 80);
            } else if (counter == 5) {
                do {
                    System.out.println("Na marcha 5 so pode ir de 81 ate 100km/h");
                    speedometer = sc.nextInt();
                }while ( speedometer < 81 || speedometer > 100);
            } else if (counter == 6) {
                do {
                    System.out.println("Na marcha 6 so pode ir de 101 ate 120km/h");
                    speedometer = sc.nextInt();
                }while ( speedometer < 101 || speedometer > 120);
            }
        }else {
            System.out.println("Tem que ligar o carro primeiro");
        }

    }
    public void getSpeedometer(){
        System.out.printf("Voce esta com %s de velocidade \n", speedometer);
    }
}
