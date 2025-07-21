package dio.messagingService.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class Messaging implements CommandLineRunner {
    @Autowired
    private Remetente remetente;
    @Override
    public void run(String... args) throws Exception{
        System.out.println("Mensagem enviada por: " + remetente.getName()+" E-mail: " +remetente.getName() + " telefone: " + remetente.getTelefone());
    }
}
