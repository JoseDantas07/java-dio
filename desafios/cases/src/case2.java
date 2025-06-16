import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class case2 {
    public static void main(String[] args) {
        String[] candidatos = {"felipe","marciar","pedro","vitoria","aleluia"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    /// case 4
    static void entrandoEmContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("contato realizado com sucesso com: " + candidato);
            }
        }while (continuarTentando && tentativasRealizadas < 3);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    /// case 4

    /// case 3
    static void imprimirSelecionados(){
        String[] candidatos = {"felipe","marciar","pedro","vitoria","aleluia"};

        System.out.println("listando todos os meus candidatos e o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("indice do elemento e n: "+ (indice+1) + " e o nome é: " + candidatos[indice]);
        }

        System.out.println("forma abreviada");

        for (String cadidato: candidatos){
            System.out.println("o nome do candidato selecionado é: " + cadidato);
        }
    }
    /// case 3

    /// case 2
    static void selecaoCandidatos(){
        String[] candidatos = {"felipe","marciar","pedro","vitoria","aleluia","alo","gaby","adeliane","henrique","maycon"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = salarioRando();

            System.out.println("O candidato " +" solicitou este valor de salario "  + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("o candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    /// case 2

    /// case 1
    static double salarioRando(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisaCandidato(double salarioBase){
        double salarioCandidato = 2000.0;
        if (salarioBase > salarioCandidato){
            System.out.println("ligar para o candidato");
        }else if(salarioBase == salarioCandidato){
            System.out.println("ligar para o candidato com contra proposta");
        }else{
            System.out.println("aguardando resultado demais candidatos");
        }
    }
    /// case 1
}
