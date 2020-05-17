package guru.springframework.sfgdi.controllers;

import guru.springframework.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Controller
public class ConstructionINjectedController {

    private final GreetingService greetingService;

//    @Autowired
    public ConstructionINjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
