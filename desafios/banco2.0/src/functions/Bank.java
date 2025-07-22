package functions;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private String login;
    private boolean finish = true;

    Map<String, User> user;


    public Bank() {
        this.user = new HashMap<>();
    }

    public void addUser(String name,String cpf,String email){
        user.put(cpf,new User(name,cpf,email));
        System.out.println("Conta Criada");
    }

    public void loginUser(String name, String cpf){
        if (user.isEmpty()){
            System.out.println("Não encotramos você no nosso banco de dados faça o cadastro se for necessario");
        }else {
            for(Map.Entry<String,User> u: user.entrySet()){
                if (u.getKey().equalsIgnoreCase(cpf) && u.getValue().getName().equalsIgnoreCase(name)){
                    login = cpf;
                    System.out.println("Seja bem vindo: " + name);
                    setFinish(false);
                    break;
                }else {
                    System.out.println("Nome ou senha invalido");
                }
            }
        }
    }

    public void deposit(double value){
        User money = user.get(login);
        for (Map.Entry<String, User>  m: user.entrySet()){
            if (m.getKey().equalsIgnoreCase(login)){
                money.setBalance(money.getBalance() + value);
                System.out.println("Seu saldo atual e de:" + money.getBalance());
            }
        }

    }

    public void sake(double value){
        User money = user.get(login);
        for (Map.Entry<String,User> m : user.entrySet()){
            if (m.getValue().getCpf().equalsIgnoreCase(login)){
                if (value > money.getBalance()){
                    System.out.println("Saldo insuficiente");
                    break;
                }
                money.setBalance(money.getBalance() - value);
            }
        }
    }

    public void displayBalance(){
        User money = user.get(login);
        System.out.println("Seu saldo atua e de :"+money.getBalance());
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
