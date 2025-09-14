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
import project.games.personal.repository.UserRepository;

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
        return userRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User does not exist"));
    }

    @Transactional(readOnly = false)
    public UserDTO createUser(InsertUserDTO dto){

        if(userRepository.findByEmail(dto.getEmail()).isPresent()){
            throw new ConflictException("Email already exists");

        }
        User user = UserMapper.toEntity(dto);
        user.setPassword(passwordEncoder.encode(dto.getPassword()));

        Role role = new Role(1L, "ROLE_USER");
        user.addRole(role);

        return UserMapper
                .toDto(userRepository.save(user));
    }


}
