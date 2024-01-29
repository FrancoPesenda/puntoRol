package punto_rol.api.internal.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "players_themes")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlayerTheme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn( name = "player_id")
    Player player ;
    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn( name = "theme_id")
    Theme theme ;
}
