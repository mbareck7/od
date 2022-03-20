package com.mpiag.apistage;

import com.mpiag.apistage.controller.StageController;
import com.mpiag.apistage.service.StageService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import ch.qos.logback.core.status.Status;




@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationTest {

    // private MockMvc mockMvc;

//     @Autowired
//     private StageService ss;

//     @Test
//     public void getStageWhenValidRequest() throws Exception{
//         this.mockMvc.perform(get("/stages"));
//         .andExpect(status().isOk())
//    }
}