package lt.home.kuber.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> get() {
        return new ResponseEntity<>("Hello world!!!", HttpStatus.OK);
    }

    @GetMapping("{name}")
    public ResponseEntity<String> sayHello(@PathVariable String name) {
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }
}
