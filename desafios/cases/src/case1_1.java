public class case1_1 {
    public static void main(String[] args){
        analisarcandidato(2000.0);
        analisarcandidato(1000.0);
        analisarcandidato(3000.0);
    }
    public static void analisarcandidato(double salarioBase){
        double salarioCandidato = 2000.0;
        if (salarioBase > salarioCandidato){
            System.out.println("ligar para o candidato");
        }else if(salarioBase == salarioCandidato){
            System.out.println("ligar para o candidato com contra proposta");
        }else{
            System.out.println("aguardando resultado demais candidatos");
        }
    }
}
