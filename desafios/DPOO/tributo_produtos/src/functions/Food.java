package functions;

import java.util.Scanner;

public class Food implements Tax {
    private double price;
    int option = -1;
    public void food(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("[1] 1 kg maça = 5.90");
            System.out.println("[2] 1 kg costela = 10.20");
            System.out.println("[3] 1 penca banana(8 uni) = 5.00");
            option = scanner.nextInt();
        }while (option < 0 || option > 3);

        switch (option){
            case 1 -> setPrice(5.90);
            case 2 -> setPrice(10.20);
            case 3 -> setPrice(5.00);
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
       setPrice(getPrice() + (getPrice() * 0.01));
        System.out.printf("O valor total com a taxa foi de %.2f",getPrice());
    }
}
