package uk.sky.ovp.githubactions.controller;

import org.springframework.http.ResponseEntity;

public class SimpleController {
    public ResponseEntity<String> printMessage() {
        return ResponseEntity.ok().body("Testing github actions");
    }
}
