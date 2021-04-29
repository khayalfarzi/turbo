package az.company.turbo.controller;

import az.company.turbo.dto.Brand;
import az.company.turbo.service.BrandService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brand")
@Api(description = "Actions on Brand")
public class BrandController {

    private final BrandService service;

    public BrandController(BrandService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Brand brand) {
        return service.create(brand);
    }

    @GetMapping
    public ResponseEntity<?> get() {
        return service.get();
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Brand brand) {
        return service.update(brand);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        return service.delete(id);
    }
}