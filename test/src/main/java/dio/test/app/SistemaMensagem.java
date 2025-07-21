package dio.test.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente pessoa;
    @Autowired
    private Remetente recrutador;

    public void enviarConfirmacaoCadastro(){
        System.out.println(pessoa);
        System.out.println("Cadastro finalizado");
    }

    public void enviarMensagemBemVindo(){
        recrutador.setEmail("ZeStore@gmail.com");
        System.out.println(recrutador);
        System.out.println("Bem vindo a Ze");
    }
}
