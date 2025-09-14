package project.games.personal.mapper;


import project.games.personal.dto.InsertUserDTO;
import project.games.personal.dto.UserDTO;
import project.games.personal.entities.User;

public class UserMapper {

    public static User toEntity(InsertUserDTO dto){
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setName(dto.getName());


        return user;
    }

    public static UserDTO toDto(User user){
        return new UserDTO(user.getId(), user.getEmail(), user.getUsername());
    }
}
