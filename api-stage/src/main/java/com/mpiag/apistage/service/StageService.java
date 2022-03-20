package com.mpiag.apistage.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StageService {

    public ArrayList<String> getStages(){
        ArrayList<String> stages = new ArrayList<String>();
        stages.add("SATGE_FIN_ETUDE");
        stages.add("STAGE_OUVRIER");
        stages.add("STAGE_DECOUVERTE");
        return(stages);
    }
}
