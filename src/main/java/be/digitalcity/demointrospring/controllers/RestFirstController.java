package be.digitalcity.demointrospring.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class RestFirstController {

    @RequestMapping("/first")
    public ResponseEntity<String> firstWebApiCall() {
        return ResponseEntity.ok("Bonjour");
    }

}
