package punto_rol.api.internal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "rol_tables" )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RolTable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    Long id ;
    @Column
    Date date ;
    @Column
    String lastName ;
    @Column
    Integer daysForWeek ;
    @OneToOne( fetch = FetchType.EAGER)
    @JoinColumn( name = "table_master_id")
    TableMaster tableMaster ;
    @OneToMany( mappedBy = "rolTable", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Column( name = "player_id")
    @JsonIgnore
    Set<Player> playerSet ;
}

