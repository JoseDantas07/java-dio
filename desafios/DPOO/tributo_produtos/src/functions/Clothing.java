package functions;

import java.util.Scanner;

public class Clothing implements Tax{
    private double price;
    int option;

    public void clothing(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("[1] Cueca = 1.90");
            System.out.println("[2] Calça = 30.99");
            System.out.println("[3] Blusa = 15.00");
            option = scanner.nextInt();
        }while (option < 0 || option > 3);

        switch (option){
            case 1 -> setPrice(1.90);
            case 2 -> setPrice(30.99);
            case 3 -> setPrice(15.00);
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
        setPrice(getPrice() + (getPrice() * 0.025));
        System.out.printf("O valor total com a taxa foi de %.2f",getPrice());
    }
}
