package webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class PersonController {

    @GetMapping("/")
    public String list(){
        return "person";
    }
}
