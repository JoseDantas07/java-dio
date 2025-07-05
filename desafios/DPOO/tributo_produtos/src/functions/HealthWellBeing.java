package functions;

import java.util.Scanner;

public class HealthWellBeing implements Tax{
    private double price;
    int option;
    public void health(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("[1] Plano de saude = 100.00");
            System.out.println("[2] Remedio = 5.99");
            System.out.println("[3] Benzetacil = 2.99");
            option = scanner.nextInt();
        }while (option < 0 || option > 3);

        switch (option){
            case 1 -> setPrice(100.00);
            case 2 -> setPrice(5.99);
            case 3 -> setPrice(2.99);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void tax() {
        setPrice(getPrice() + (getPrice() * 0.015));
        System.out.printf("O valor total com a taxa foi de %.2f",getPrice());
    }
}
