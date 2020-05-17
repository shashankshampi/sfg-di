package guru.springframework.sfgdi.controllers;

import guru.springframework.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructionINjectedControllerTest {

    ConstructionINjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructionINjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}