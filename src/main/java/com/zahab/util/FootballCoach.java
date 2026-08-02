package com.zahab.util;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getWorkout() {
        return "Practice Football for 30 minutes daily";
    }
}
