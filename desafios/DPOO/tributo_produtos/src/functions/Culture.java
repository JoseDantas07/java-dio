package functions;

import java.util.Scanner;

public class Culture implements Tax{
    private double price;
    int option;

    public void culture(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("[1] viajar = 160.00");
            option = scanner.nextInt();
        }while(option < 0 || option > 1);

        if (option == 1){
            setPrice(160.00);
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
        setPrice(getPrice() + (getPrice() * 0.04));
        System.out.printf("O valor total com a taxa foi de %.2f",getPrice());
    }
}
