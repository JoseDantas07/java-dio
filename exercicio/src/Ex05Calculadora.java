import java.util.Scanner;

public class Ex05Calculadora {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("qual tabuada voce quer ver");
        var tabuada = sc.nextInt();

        System.out.println("[1] soma");
        System.out.println("[2] subtrair");
        System.out.println("[3] mutiplicação");
        System.out.println("[4] divisão");
        var opacao = sc.nextInt();
        switch (opacao){
            case 1:{
                for(var i = 1; i <= 10; i++){
                    System.out.printf("%s + %s = %s \n",tabuada,i, tabuada + i);
                }
                break;
            }
            case 2:{
                for(var i = 1; i <= 10; i++){
                    System.out.printf("%s - %s = %s \n",tabuada,i, tabuada - i);
                }
                break;
            }
            case 3:{
                for(var i = 1; i <= 10; i++){
                    System.out.printf("%s * %s = %s \n",tabuada,i, tabuada * i);
                }
                break;
            }
            case 4:{
                for(var i = 1; i <= 10; i++){
                    System.out.printf("%s / %s = %s \n",tabuada,i, tabuada / i);
                }
                break;
            }

        }

    }
}
