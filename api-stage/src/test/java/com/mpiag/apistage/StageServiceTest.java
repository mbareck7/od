package com.mpiag.apistage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import com.mpiag.apistage.service.StageService;

import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;

public class StageServiceTest {
    private StageService ss = new StageService();

    @Test
    public void contextLoads() throws Exception {
    ArrayList<String> stages = new ArrayList<String>();
    stages.add("SATGE_FIN_ETUDE");
    stages.add("STAGE_OUVRIER");
    stages.add("STAGE_DECOUVERTE");

    assertEquals(stages, ss.getStages());
   }
}
