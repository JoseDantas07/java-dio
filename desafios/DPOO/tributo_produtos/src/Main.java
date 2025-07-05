import functions.Clothing;
import functions.Culture;
import functions.Food;
import functions.HealthWellBeing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Food food = new Food();
        HealthWellBeing healthWellBeing = new HealthWellBeing();
        Culture culture = new Culture();
        Clothing clothing  = new Clothing();
        int option;

        do {
            System.out.println("Olhar o imposto Sobre ");
            System.out.println("[1] Alimentação");
            System.out.println("[2] Saude e bem estar");
            System.out.println("[3] Vestuário");
            System.out.println("[4] Cultura");
            option = scanner.nextInt();
        }while (option < 1 || option > 4);

        switch (option){
            case 1 -> {
                food.food();
                food.tax();
            }
            case 2 -> {
                healthWellBeing.health();
                healthWellBeing.tax();
            }
            case 3 ->{
                clothing.clothing();
                clothing.tax();
            }
            case 4 ->{
                culture.culture();
                culture.tax();
            }
        }
    }
}