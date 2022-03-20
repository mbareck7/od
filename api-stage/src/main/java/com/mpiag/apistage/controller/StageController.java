package com.mpiag.apistage.controller;

import java.util.ArrayList;
import com.mpiag.apistage.service.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StageController {

    StageService ss = new StageService();
    @GetMapping("/stages")
    public ArrayList<String> getStages(){ return ss.getStages();}
}
