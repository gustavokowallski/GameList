package project.games.personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.games.personal.entities.Games;

public interface GameRepository extends JpaRepository<Games, Long> {
}
