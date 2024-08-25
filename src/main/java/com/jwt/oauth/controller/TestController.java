package com.jwt.oauth.controller;
/*
 * @author Naveen K Wodeyar
 * @date 25-08-2024
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/")
    public String greet(){
        LOGGER.info("Inside greet()!,");
       return "Welcome to OpenAuthentication 2.0 using GitHub,";
    }

    @GetMapping("/test")
    public ResponseEntity<?> test(){
        LOGGER.info("Accessed test endPoint,");
        return ResponseEntity.status(HttpStatus.FOUND)
                .header("Content-Type", "application/String")
                .body("Welcome to OpenAuthentication 2.0,");
    }
}
