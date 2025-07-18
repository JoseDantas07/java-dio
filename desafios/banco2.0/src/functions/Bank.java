package functions;

public class Bank {

    User user = new User();

    public Bank(String name,String cpf) {
        user.setName(name);
        user.setCpf(cpf);
    }

    public void deposit(double valor){
        user.setBalance(user.getBalance() + valor) ;
    }

    public void withdraw(double valor){
        if (valor > user.getBalance()){
            System.out.println("Saldo indisponivel");
            return;
        }
        user.setBalance(user.getBalance() - valor);
    }

    public void displayBalance(){
        System.out.println( user.getBalance());
    }
}
