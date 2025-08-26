package estudo;

import estudo.dto.UserDTO;
import estudo.mapper.UserMapper;
import estudo.model.UserModel;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

public class Main {
    private static final UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);
    public static void main(String[] args) {
        UserDTO DTO = new UserDTO();
        DTO.setName("jose");
        DTO.setId(1L);
        DTO.setLocalDate(LocalDate.now());
        System.out.println(USER_MAPPER.toModel(DTO));

        UserModel model = new UserModel();
        model.setUserName("lisa");
        model.setCode(3L);
        model.setLocalDate(LocalDate.now());
        System.out.println(USER_MAPPER.toDTO(model));
    }

}
