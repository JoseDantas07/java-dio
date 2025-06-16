import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("digite o priemiro numero");
            int n1 = sc.nextInt();

            System.out.println("digite o segundo numero");
            int n2 = sc.nextInt();

            CalcularExtends.contar(n1, n2);
        } catch (CalcularExtends.NumeroMaior e ) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        sc.close();
    }

}
