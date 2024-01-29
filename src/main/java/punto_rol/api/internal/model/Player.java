package punto_rol.api.internal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table( name = "players" )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Player {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    Long id ;
    @Column
     String name ;
    @Column
    String lastName ;
    @Column
    Integer daysForWeek ;
    @Column
    Integer weeks ;
    @OneToMany( mappedBy = "player", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Column( name = "player_theme_id")
    @JsonIgnore
    Set<PlayerTheme> playerThemeSet ;
    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn( name = "rol_table_id")
    RolTable rolTable ;
}
