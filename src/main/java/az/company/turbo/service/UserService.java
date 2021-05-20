package az.company.turbo.service;

import az.company.turbo.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    ResponseEntity<?> register(UserDto user);

    ResponseEntity<?> login(String username, String password);

    ResponseEntity<?> logout();
}
