package visual;

public class BankInterface {

    public void displayLogin(){
        System.out.println("[1] Entra");
        System.out.println("[2] Cadastrar");
    }

    public void displayAccount(){
        System.out.println("[1] Conta corrente");
        System.out.println("[2] Conta poupança");
    }

    public void displayMenu() {
        System.out.println("[1] Deposita dinheiro");
        System.out.println("[2] Retira dinheiro");
        System.out.println("[3] Mostra saldo");
        System.out.println("[0] Sair");
    }

}
