package functions;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    Map<String,User> user;

    public Bank() {
        this.user = new HashMap<>();
    }

    public void addUser(String name,String cpf,String email){
        user.put(cpf,new User(name,cpf,email));
    }

    public void deposit(String value){
        // pegando a chave primaria e deposita
        //
    }

    public void loginUser(String cpf){
        if (user.isEmpty()){
            System.out.println("A lista esta vazia");
        }else {
            for(Map.Entry<String,User> u: user.entrySet()){
                if (u.getKey() == cpf){
                    //guarda a chave prmaria buma variavel
                    System.out.println(u.getValue());
                    break;
                }
            }
        }
        }

}
