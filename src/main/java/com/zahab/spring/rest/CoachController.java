package com.zahab.spring.rest;

import com.zahab.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    private Coach myCoach;

    //  Constructor Injection
    @Autowired
    public CoachController(Coach coach) {
        this.myCoach = coach;
    }

//    Setter injection
//    @Autowired
//    public void setMyCoach(Coach coach) {
//        this.myCoach = coach;
//    }


    @GetMapping("/getWorkout")
    public String getWorkout() {
        return myCoach.getWorkout();
    }
}
