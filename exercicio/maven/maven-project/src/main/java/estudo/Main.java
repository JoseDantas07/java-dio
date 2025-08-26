package estudo;

import estudo.dto.UserDTO;
import estudo.mapper.UserMapper;
import estudo.model.UserModel;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

public class Main {
    private final static UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    public static void main(String[] args) {

        UserModel userModel = new UserModel();
        userModel.setBirthday(LocalDate.now());
        userModel.setUserName("jose");
        userModel.setCode(2L);
        System.out.println(userMapper.toDTO(userModel));


        UserDTO userDTO = new UserDTO();
        userDTO.setBirthday(LocalDate.now());
        userDTO.setName("ana");
        userDTO.setId(1L);
        System.out.println(userMapper.toModel(userDTO));

    }
}
