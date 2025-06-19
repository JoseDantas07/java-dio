import java.util.Scanner;

public class Ex07EscolherParEImpar {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n1,n2,opcao;

        do {
            System.out.println("O segundo numero tem que ser maior que o primeiro");
            System.out.print("Digite o primeiro numero: ");
            n1 = sc.nextInt();
            System.out.print("Digite o segundo numero: ");
            n2 = sc.nextInt();
        } while (n2 < n1);

        do {
            System.out.println("Escolha entre");
            System.out.println("[1] Par \n[2] Impar");
            opcao = sc.nextInt();
            switch (opcao){
                case 1: {
                    for (int i = n2; i >= n1; i--){
                        if(i % 2 == 0){
                            System.out.println(i);

                        }
                    }
                    break;
                }
                case 2: {
                    for (int i = n2; i >= n1; i--){
                        if (i % 2 == 1 ){
                            System.out.println(i);
                        }
                    }
                    break;
                }
                default:{
                    System.out.println("digite os numeros 1 ou 2 para continuar ");
                    break;
                }
            }
        }while(opcao != 1 && opcao != 2);
    }
}
