package az.company.turbo.service;

import az.company.turbo.dto.Brand;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface BrandService extends CrudService<Brand, Integer> {

    ResponseEntity<?> getByName(String name);
}