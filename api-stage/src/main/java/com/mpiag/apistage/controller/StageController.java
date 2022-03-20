package com.mpiag.apistage.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StageController {

    @GetMapping("/stages")
    public ArrayList<String> getStage(){
        ArrayList<String> stages = new ArrayList<String>();
        stages.add("SATGE_FIN_ETUDE");
        stages.add("STAGE_OUVRIER");
        stages.add("STAGE_DECOUVERTE");
        return(stages);
    }
}
