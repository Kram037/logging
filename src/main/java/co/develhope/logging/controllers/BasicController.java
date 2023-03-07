package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Autowired
    BasicService basicService;

    @GetMapping("/")
    public String welcomeMSG(){
        logger.info("Welcome controller");
        return "Welcome!";
    }

    @GetMapping("/exp")
    public String getExp(){
        return "The result is: " + basicService.getExp();
    }

    @GetMapping("/get-errors")
    public void getError(){
        logger.error("Found an error");
        throw new RuntimeException("Something went wrong");
    }
}