package project.games.personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.games.personal.entities.Roles;

@Repository
public interface RoleRepository extends JpaRepository<Roles, String> {
}
