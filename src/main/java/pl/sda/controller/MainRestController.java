package pl.sda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MainRestController {

    @GetMapping("/getText")
    public String getText() {
        return "To jest mój tekst " + new Random().nextInt(100);
    }
}
