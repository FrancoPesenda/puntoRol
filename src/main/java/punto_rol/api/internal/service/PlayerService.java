package punto_rol.api.internal.service;

import punto_rol.api.internal.model.Player;
import punto_rol.api.internal.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository ;
    public Player save(Player player){ return repository.save(player);}

    public Player findByNameAndLastName(String name, String last_name) { return repository.findPlayerByNameAndLastName(name, last_name).get() ;}

}
