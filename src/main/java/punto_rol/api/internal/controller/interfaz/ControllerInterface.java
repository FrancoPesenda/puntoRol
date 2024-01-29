package punto_rol.api.internal.controller.interfaz;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ControllerInterface <EO,I>{

    ResponseEntity<List<EO>> findAll() ;

    ResponseEntity<EO> findById(I id ) ;

    ResponseEntity<EO> save ( EO entity ) ;

    ResponseEntity<EO> modify ( I Id ,EO entity ) ;

    ResponseEntity<String> delete(I id ) ;

}
