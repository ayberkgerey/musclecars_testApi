package com.geray.musclecars.service;

import com.geray.musclecars.model.MuscleCar;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MuscleService {

    private static List<MuscleCar> carList = new ArrayList<>();

    static{
        carList.add(new MuscleCar(1,"Ford","Mustang","1969"));
        carList.add(new MuscleCar(2,"Dodge","Charger","1970"));
        carList.add(new MuscleCar(3,"Chevrolet","Stingray","1972"));
        carList.add(new MuscleCar(4,"Plymouth","Satellite","1972"));
        carList.add(new MuscleCar(5,"Chevrolet","Camaro","1977"));
        carList.add(new MuscleCar(6,"Plymouth","Roadrunner","1970"));
        carList.add(new MuscleCar(7,"Chevrolet","Chevelle","1969"));
    }


    public List<MuscleCar> getCars() {
        return carList;
    }
}
