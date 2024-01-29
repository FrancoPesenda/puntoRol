package punto_rol.api.internal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table( name = "table_masters" )
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TableMaster {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    Long id ;
    @Column
    String name ;
    @Column
    String lastName ;
    @OneToMany( mappedBy = "tableMaster", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Column( name = "table_master_theme_id")
    @JsonIgnore
    Set<TableMasterTheme> tableMasterThemeSet ;

}
