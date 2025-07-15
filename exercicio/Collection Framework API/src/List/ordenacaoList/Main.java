package List.ordenacaoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        orderPerson orderPerson = new orderPerson();

        int option;

        System.out.println("Cadastro pessoa");
        System.out.println("[1] Adicionar Pessoa");
        System.out.println("[2] Ordenar Por Idade");
        System.out.println("[3] Ordenar Por Altura");
        option = scanner.nextInt();
        scanner.nextLine();
        switch (option){
            case 1-> {
                System.out.println("Digite o nome");
                String name = scanner.nextLine();

                System.out.println("Digite a sua idade");
                int age = scanner.nextInt();

                System.out.println("Digite a sua altura");
                double height = scanner.nextDouble();

                orderPerson.addPeople(name,age,height);
            }
            case 2-> System.out.println(orderPerson.sortByAge());
            case 3-> System.out.println(orderPerson.sortByHeight());
        }
    }
}
