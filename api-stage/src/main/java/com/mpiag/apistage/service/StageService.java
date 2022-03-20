package com.mpiag.apistage.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class StageService {
    private ArrayList<String> stages;

     public ArrayList<String> getStages(){
        stages = new ArrayList<String>();
        stages.add("SATGE_FIN_ETUDE");
        stages.add("STAGE_OUVRIER");
        stages.add("STAGE_DECOUVERTE");
        return(stages);
    }
}
