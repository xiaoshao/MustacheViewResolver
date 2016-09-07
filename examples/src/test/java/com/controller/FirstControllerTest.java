package com.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(MockitoJUnitRunner.class)
public class FirstControllerTest {

    MockMvc mockMvc;

    @Before
    public void before() {
        FirstController controller = new FirstController();
        mockMvc = standaloneSetup(controller).build();
    }

    @Test
    public void shouldReturnJSON() throws Exception {
        mockMvc.perform(get("/first"))
                .andExpect(view().name("hello"));
    }

}
