package project.games.personal.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.games.personal.dto.InsertUserDTO;
import project.games.personal.dto.UserDTO;
import project.games.personal.entities.Role;
import project.games.personal.entities.User;
import project.games.personal.exception.ConflictException;
import project.games.personal.mapper.UserMapper;
import project.games.personal.projections.UserDetailsProjection;
import project.games.personal.repository.UserRepository;

import java.util.List;

@Service
public class UserService implements UserDetailsService {


    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;

        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<UserDetailsProjection> result = userRepository.searchUserAndRolesByEmail(username);
        if (result.isEmpty()) {
            throw new UsernameNotFoundException("Email not found");
        }

        User user = new User(result.getFirst().getUsername(), result.getFirst().getPassword());
        for (UserDetailsProjection projection : result) {
            user.addRole(new Role(projection.getRoleId(), projection.getAuthority()));
        }

        return user;
    }

    @Transactional(readOnly = false)
    public UserDTO createUser(InsertUserDTO dto){
        if(userRepository.findByEmail(dto.getEmail()).isPresent()){
            throw new ConflictException("Email already exists");
        }
        User user = UserMapper.toEntity(dto);
        user.updatePassword(passwordEncoder.encode(dto.getPassword()));

        return UserMapper
                .toDto(userRepository.save(user));
    }


}
