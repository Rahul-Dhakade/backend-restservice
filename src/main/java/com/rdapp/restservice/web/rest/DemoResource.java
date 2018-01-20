package com.rdapp.restservice.web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource{
    @GetMapping("/demo")
    public ResponseEntity<?> demo(){
        return new ResponseEntity<>("HI", HttpStatus.OK);
    }
}