package az.company.turbo.service.impl;

import az.company.turbo.dto.Brand;
import az.company.turbo.entity.BrandEntity;
import az.company.turbo.repository.BrandRepository;
import az.company.turbo.service.BrandService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository repository;

    public BrandServiceImpl(BrandRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<?> create(Brand brand) {
        BrandEntity entity = new BrandEntity();
        entity.setName(brand.getName());

        entity = repository.save(entity);
        brand = convertFromEntityToDto(entity);
        return ResponseEntity.ok(brand);
    }

    @Override
    public ResponseEntity<?> get() {
        List<Brand> brandsDTO = repository.findAll().stream()
                .map(this::convertFromEntityToDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(brandsDTO);
    }

    @Override
    public ResponseEntity<?> update(Brand brand) {
        BrandEntity entity = getById(brand.getId());

        entity.setName(brand.getName());
        entity = repository.save(entity);

        brand = convertFromEntityToDto(entity);
        return ResponseEntity.ok(brand);
    }

    @Override
    public ResponseEntity<?> delete(Integer integer) {
        BrandEntity entity = getById(integer);
        repository.delete(entity);
        return ResponseEntity.ok(String.format("Raw with %s id successfully deleted.", integer));
    }

    private Brand convertFromEntityToDto(BrandEntity entity) {
        return new Brand(entity.getId(), entity.getName());
    }

    private boolean checkId(Integer id) {
        return repository.existsById(id);
    }

    private BrandEntity getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Brand id not founded."));
    }

    @Override
    public ResponseEntity<?> getByName(String name) {
        return ResponseEntity.ok(convertFromEntityToDto(
                repository.findBrandEntityByName(name)
                        .orElseThrow(() ->
                                new RuntimeException("The name you have entered not founded"))));
    }
}