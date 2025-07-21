package dio.spring_data_jpa;

import dio.spring_data_jpa.model.User;
import dio.spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {

        User user = new User();

        user.setName("jose");
        user.setUsername("Ze");
        user.setPassword("321");

        repository.save(user);

        for (User u : repository.findAll()){
            System.out.println(u);
        }
    }
}
