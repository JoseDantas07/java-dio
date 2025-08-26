package estudo.mapper;

import estudo.dto.UserDTO;
import estudo.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

    @Mapping(target = "userName",source = "name")
    @Mapping(target ="code", source = "id")
    UserModel toModel(final UserDTO dto);

    @Mapping(target = "name", source = "userName")
    @Mapping(target = "id", source = "code")
    UserDTO toDTO(final UserModel model);
}
