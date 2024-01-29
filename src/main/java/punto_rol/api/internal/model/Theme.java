package punto_rol.api.internal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table( name = "themes" )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Theme {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    Long id ;
    @Column
    String name ;
    @OneToMany( mappedBy = "theme", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Column( name = "player_theme_id")
    @JsonIgnore
    Set<PlayerTheme> playerThemeSet ;
}
