package punto_rol.api.internal.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import punto_rol.api.internal.model.Player;
import punto_rol.api.internal.service.PlayerService;

@RestController
@RequestMapping("/player")
@CrossOrigin(origins = "*")
public class PlayerController {
    @Autowired
    private PlayerService service ;

    Logger logger = LoggerFactory.getLogger(PlayerController.class) ;

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @ApiOperation(value = "Guarda un jugador",
            notes = "guarda un jugador nuevo y lo devuelve")
    @PostMapping
    public ResponseEntity<Player> save(
            @ApiParam(
                    name =  "Player",
                    type = "Player",
                    value = "\"name\": \"Nombre del jugador\",\n" +
                            "\"last_name\": \"Apellido del jugador\",\n" +
                            "\"theme\": \"Témas que le interesan\"\n",
                    required = true)
            @RequestBody Player inPlayer){
        Player player = new Player() ;
        player.setName(inPlayer.getName());
        player.setLastName(inPlayer.getLastName());
        player.setPlayerThemeSet(inPlayer.getPlayerThemeSet());
        return ResponseEntity.ok(service.save(player)) ;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @ApiOperation(value = "Devuelve un jugador",
            notes = "Devuelve una Jugador filtrado por nombre y apellido ")
    @GetMapping
    public ResponseEntity<Player> findByNameAndLastName(
            @ApiParam(
                    name =  "id",
                    type = "Long",
                    value = "Id del producto que estoy buscando encontrar",
                    example = "1",
                    required = true )
            @RequestParam String name,
            @RequestParam String lastName){
        return ResponseEntity.ok(service.findByNameAndLastName(name, lastName)) ;
    }
}
