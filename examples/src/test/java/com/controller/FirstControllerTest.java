package com.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
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
    public void shouldReturnCorrectView() throws Exception {
        mockMvc.perform(get("/first"))
                .andExpect(view().name("hello"));
    }

    @Test
    public void shouldReturnCorrectModel() throws Exception {
        mockMvc.perform(get("/second"))
                .andExpect(view().name("secondView"))
                .andExpect(model().attributeExists("record"));
    }

    @Test
    public void shouldReturnCorrectModelRecord() throws Exception {
        mockMvc.perform(get("/third"))
                .andExpect(model().attributeExists("record"));
    }
}
