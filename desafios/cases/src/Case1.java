import java.util.Scanner;
public class Case1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double salarioBase = 2000.0;

        System.out.print("quanto vocer quer ganha de salario ?: ");
        double salarioCandidato = sc.nextDouble();

        if (salarioBase > salarioCandidato){
            System.out.println("ligar para o candidato");
        }else if(salarioBase == salarioCandidato){
            System.out.println("ligar para o candidato com contra proposta");
        }else{
            System.out.println("aguardando resultado demais candidatos");
        }
    }
}
