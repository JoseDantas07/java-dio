import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("digite um numero de 1 a 7");
        var opcao = scanner.nextInt();

        switch (opcao){
            //ele junta com o 7
            case 1:{}
                case 7:{
                System.out.println("a");
                break;
                }
            case 2: {
                System.out.println("b");
                break;
            }
        }
    }
}
