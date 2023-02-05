package com.eastshine.maven.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloControllerUnitTest {

    @Test
    void hello() {
        HelloController helloController = new HelloController();

        String response = helloController.hello();

        assertThat(response).isEqualTo(HelloController.HELLO_MESSAGE);
    }
}
