package rest.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping(consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class PathDefaultController {

    @GetMapping(path = "/")
    public ResponseEntity pathDefault() throws JsonProcessingException {
        ResponseEntity objectResponseEntity = restTemplate();
        return ResponseEntity.ok(objectResponseEntity.getBody());
    }

    public ResponseEntity restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity forEntity = restTemplate.getForEntity(URI.create("http://localhost:8080/api/path"), String.class);
        return forEntity;
    }
}
