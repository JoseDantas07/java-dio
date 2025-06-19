import java.util.Scanner;

public class Ex08ValidadorCondicionais {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        for(;;){
            System.out.print("digite o primeiro numero: ");
            var n1 = sc.nextInt();
            System.out.print("digite o segundo numero: ");
            var n2 = sc.nextInt();

            if (n1 < n2){
                if (n1 % 2 != 0){
                    break;
                }
            }
        }
    }
}
