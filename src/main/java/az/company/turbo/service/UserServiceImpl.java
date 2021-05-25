package az.company.turbo.service;

import az.company.turbo.dto.UserDto;
import az.company.turbo.repository.RoleRepository;
import az.company.turbo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public ResponseEntity<?> register(UserDto user) {
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

//    @Override
//    public void save(SecurityProperties.User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setRoles(new HashSet<>(roleRepository.findAll()));
//        userRepository.save(user);
//    }

//    @Override
//    public User findByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
}