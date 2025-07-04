package servicesMessage;

public class Email implements Marketing{
    @Override
    public void message() {
        System.out.println("Olá! Chegou a hora de renovar com estilo e economia. Todos os produtos da nossa loja estão com até 50% OFF. Garanta já o seu");
    }
}
