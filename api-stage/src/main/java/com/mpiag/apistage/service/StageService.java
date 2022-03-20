package com.mpiag.apistage.service;

import java.util.ArrayList;

import com.mpiag.apistage.persistance.model.Stage;
import com.mpiag.apistage.persistance.repository.StageRepository;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

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


    @PostMapping("/stage")
    private Stage saveStage(String stage){
        StageRepository sr = new StageRepository();
        Stage s = new Stage();
        s.setValeur(stage);
        return sr.save(s);
    }
}