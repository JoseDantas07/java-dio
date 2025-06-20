package cadastro;

public class User {

    private String name;
    private int age;
    private double balance;
    private double check;


    public User(String name, int age, double balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
        precoDoCheque(balance,check);
    }
    public void precoDoCheque(double balance, double check){
        if (balance <= 500){
            this.check = 50;
        }if (balance > 500){
            this.check = balance/2;
        }
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getBalance(){
      return balance;
    }
    public double getCheck(){
        return check;
    }


}
