package project.games.personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.games.personal.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
