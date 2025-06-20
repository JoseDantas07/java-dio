import cadastro.User;

public class Main{

    public static void main(String[] args) {
        var cliente1 = new User("jose",21,2000);
        System.out.println( cliente1.getName()+" "+cliente1.getAge()+" "+cliente1.getBalance()+" "+cliente1.getCheck());
    }

    

    public static void opcao(){
        System.out.println("[1] Consultar saldo");
        System.out.println("[2] Consultar cheque especial");
        System.out.println("[3] Depositar dinheiro");
        System.out.println("[4] Sacar dinheiro");
        System.out.println("[5] Pagar um boleto");
        System.out.println("[6] Verificar se a conta esta usando o cheque especial");
    }
}