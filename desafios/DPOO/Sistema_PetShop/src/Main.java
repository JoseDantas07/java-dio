import java.util.Scanner;

import machine.PetMachine;
import pet.Pet;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    private static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;
        do{
            System.out.println("[1] Dar banho no pet");
            System.out.println("[2] Abastecer a maquina com agua");
            System.out.println("[3] abastecer a maquina com shampoo");
            System.out.println("[4] verificar a agua da maquina");
            System.out.println("[5] verificar o shampoo da maquina");
            System.out.println("[6] verificar se tem pet no banho");
            System.out.println("[7] colocar pet na maquina");
            System.out.println("[8] retirar o pet da maquina");
            System.out.println("[9] limpar a maquina");
            System.out.println("[0] sair");
            option = sc.nextInt();

            switch (option){
                case 1 -> petMachine.takeshower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("opção invalida");
            }
        }while(true);


    }

    private static void setWater(){
        System.out.println("Tentando colocar shampoo na maquina");
        petMachine.addWater();
    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na maquina");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount =petMachine.getWater();
        System.out.println("A maquina esta no momento com" + amount + "de shampoo");
    }

    private static void verifyShampoo() {
        var amount =petMachine.getShampoo();
        System.out.println("A maquina esta no momento com" + amount + "de shampoo");
    }

    private static void checkIfHasPetInMachine() {
       var hasPet = petMachine.haspet();
       System.out.println(hasPet ? "tem pet na maquina" : "nao tem pet na maquina");
    }

    public static void setPetInPetMachine(){
        var name="";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            sc.nextLine();
            name = sc.nextLine();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }
}