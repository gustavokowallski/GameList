package project.games.personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import project.games.personal.entities.User;

@Service
public interface UserRepository extends JpaRepository<User, Long> {
}
