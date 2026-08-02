package com.zahab.util;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {
    @Override
    public String getWorkout() {
        return "Practice Hockey daily";
    }
}
