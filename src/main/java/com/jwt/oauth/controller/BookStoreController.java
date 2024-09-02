package com.jwt.oauth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author NaveenWodeyar
 * @date 02-09-2024
 */
@RestController
@RequestMapping("/v1/bookStore")
public class BookStoreController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookStoreController.class);

    @GetMapping
    public ResponseEntity<?> greet(){
        LOGGER.info("Accessed test endPoint,");
        return ResponseEntity.status(HttpStatus.FOUND)
                .header("Content-Type", "application/String")
                .body("Welcome to OpenAuthentication 2.0, using GitHub,,");
    }
}
