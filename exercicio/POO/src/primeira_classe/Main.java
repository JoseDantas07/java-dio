package primeira_classe;

public class Main {
    public static void main(String[] args) {
        var male = new Person("joao");
        male.incAge();

        male.setAge(21);

        var female = new Person("maria");
        female.incAge();

        System.out.println("nome: "+ male.getName() + "\nidade: "+ male.getAge());
        System.out.println("nome: "+ female.getName() + "\nidade: "+ female.getAge());
    }
}
