package List.ordenacaoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OrdemPessoas ordemPessoas = new OrdemPessoas();

        int option;

        System.out.println("Cadastro pessoa");
        System.out.println("[1] Adicionar Pessoa");
        System.out.println("[2] Ordenar Por Idade");
        System.out.println("[3] Ordenar Por Altura");
        option = scanner.nextInt();

        switch (option){
            case 1-> {
                System.out.println("Digite o nome");
                String name = scanner.nextLine();

                System.out.println("Digite a sua idade");
                int age = scanner.nextInt();

                System.out.println("Digite a sua altura");
                double height = scanner.nextDouble();

                ordemPessoas.addPeople(name,age,height);
            }
            case 2-> System.out.println(ordemPessoas.sortByAge());
            case 3-> System.out.println(ordemPessoas.sortByHeight());
        }
    }
}
