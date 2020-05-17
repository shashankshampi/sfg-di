package guru.springframework.sfgdi.controllers;

import guru.springframework.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {

    SetterInjectionController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectionController();
        controller.setGreetingService(new GreetingServiceImpl());
    }


    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}