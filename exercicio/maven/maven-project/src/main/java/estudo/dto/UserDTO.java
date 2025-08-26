package estudo.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {

    private Long id;
    private String name;
    private LocalDate birthday;
}
