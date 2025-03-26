package uk.sky.ovp.githubactions.controller;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;


class SimpleControllerTest {

    @Test
    void printMessage_returns200AndMessage() {
        SimpleController simpleController = new SimpleController();
        // When
        ResponseEntity<String> response = simpleController.printMessage();
        // Then
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("Testing github actions");

    }

}