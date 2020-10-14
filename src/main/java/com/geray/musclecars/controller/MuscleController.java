package com.geray.musclecars.controller;

import com.geray.musclecars.model.MuscleCar;
import com.geray.musclecars.service.MuscleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MuscleController {

    private MuscleService muscleService;

    @Autowired
    public MuscleController(MuscleService muscleService) {
        this.muscleService = muscleService;
    }

    @GetMapping("cars")
    private List<MuscleCar> getCars(){
        return muscleService.getCars();
    }



}
