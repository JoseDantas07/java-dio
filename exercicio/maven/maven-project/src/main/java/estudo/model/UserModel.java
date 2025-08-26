package estudo.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserModel {
    private Long code;
    private String UserName;
    private LocalDate birthday;
}
