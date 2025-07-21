package dio.messagingService.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remetente {

    private String name;
    private String email;
    private List<Long> telefone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Long> telefone) {
        this.telefone = telefone;
    }
}
