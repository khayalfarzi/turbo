package az.company.turbo.service.impl;

import az.company.turbo.dto.UserDto;
import az.company.turbo.entity.UserEntity;
import az.company.turbo.repository.UserRepository;
import az.company.turbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    @Autowired
    private BCryptPasswordEncoder encoder;

    /*
     * EJB stateful
     * req 1 -> new object1 (done)
     * req 2 -> new object2 ...
     *
     * EJB stateless
     * req 1 -> new object1 (done)
     * req 2 -> new object1 ...
     * req 3 -> new object2...
     *
     * EJB singleton
     * new object
     * req 1 -> object ...
     * req 2 -> object...
     * req 3 -> object...
     * */
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<?> register(UserDto user) {
        UserEntity entity = UserEntity.builder()
                .name(user.getName())
                .build();

        if (repository.existsByUsername(user.getUsername()))
            throw new RuntimeException("Username already exist.");

        entity.setUsername(user.getUsername());

        if (user.getPassword().equals(user.getConfirmPassword()))
            entity.setPassword(encoder.encode(user.getPassword()));
        else throw new RuntimeException("Password and password confirm don't match");

        return null;
    }

    @Override
    public ResponseEntity<?> login(String username, String password) {
        return null;
    }

    @Override
    public ResponseEntity<?> logout() {
        return null;
    }
}
