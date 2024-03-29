package punto_rol.api.internal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playerTheme")
@CrossOrigin(origins = "*")
public class PlayerThemeController {
    Logger logger = LoggerFactory.getLogger(PlayerController.class) ;
}
