package de.atruvia.simplewebapp;


import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@RestController
@RequestMapping("/demo")
public class DemoController {



    @GetMapping(path="/gruss", produces = MediaType.TEXT_PLAIN_VALUE)
    public String hallo() {
        return "Hallo Rest";
    }
}
