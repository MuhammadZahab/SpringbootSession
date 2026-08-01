package com.zahab.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Practice for 15 minutes daily";
    }
}
