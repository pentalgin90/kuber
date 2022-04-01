package lt.home.kuber.controller;

import org.apache.logging.log4j.util.Strings;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController {

    @GetMapping("{name}")
    public ResponseEntity<String> sayHello(@PathVariable String name) {
        var answer = Strings.isNotBlank(name) ? name : "Everyone";
        return new ResponseEntity<>("Hello " + answer, HttpStatus.OK);
    }
}
