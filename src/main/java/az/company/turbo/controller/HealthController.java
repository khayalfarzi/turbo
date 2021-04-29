package az.company.turbo.controller;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@Api(value = "Health", description = "For testing")
public class HealthController {

    @GetMapping("/control")
    public ResponseEntity<?> health() {
        return ResponseEntity.ok().body("OK");
    }
}