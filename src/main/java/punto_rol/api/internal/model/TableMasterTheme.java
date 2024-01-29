package punto_rol.api.internal.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "table_masters_themes")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TableMasterTheme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn( name = "table_master_id")
    TableMaster tableMaster ;
    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn( name = "theme_id")
    Theme theme ;
}
