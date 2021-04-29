package az.company.turbo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface CrudService<DTO, ID> {

    default ResponseEntity<?> create(DTO dto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

   default ResponseEntity<?> get(){
       return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
   }

   default ResponseEntity<?> update(DTO dto){
       return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
   }

   default ResponseEntity<?> delete(ID id){
       return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
   }
}