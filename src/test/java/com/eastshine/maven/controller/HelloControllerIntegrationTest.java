package com.eastshine.maven.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@ContextConfiguration({
        "file:web/WEB-INF/applicationContext.xml",
        "file:web/WEB-INF/dispatcher-servlet.xml"})
public class HelloControllerIntegrationTest {

    private MockMvc mockMvc;

    @BeforeEach
    void setUp(final WebApplicationContext wac) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    void name() throws Exception {
        mockMvc.perform(
                get("/hello")
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isOk());
    }
}
