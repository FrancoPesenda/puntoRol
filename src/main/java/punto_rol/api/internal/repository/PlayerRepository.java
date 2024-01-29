package punto_rol.api.internal.repository;

import punto_rol.api.internal.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface PlayerRepository extends JpaRepository<Player, Long> {
    Optional<Player> findPlayerByNameAndLastName(String name, String lastName);
}
