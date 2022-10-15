package com.projone.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "intro")
public class IntroductionController {

    @GetMapping()
    public ResponseEntity<String> getGreeting() {
        return new ResponseEntity<>("Hello from the test app !", HttpStatus.OK);
    }
}
