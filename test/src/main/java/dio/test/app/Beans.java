package dio.test.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("ola");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreplay@gmail.com");
        remetente.setNome("ZeStore");
        return remetente;
    }
}
