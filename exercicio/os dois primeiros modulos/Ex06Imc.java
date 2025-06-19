import java.util.Scanner;

public class Ex06Imc {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        var peso = sc.nextDouble();
        System.out.print("Digite o seu altura: ");
        var altura = sc.nextDouble();

        var IMC = peso / (altura * altura);

        if (IMC <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.6 && IMC <= 24.9) {
            System.out.println("peso ideal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("levemente acima do peso");
        }else if (IMC >= 30 && IMC <= 34.9){
            System.out.println("Obsidade Grau 1");
        }else if (IMC >= 35 && IMC <= 39.9){
            System.out.println("Obesidade Grau 2");
        } else if (IMC >= 40) {
            System.out.println("Obesidade 3");
        }
    }
}
