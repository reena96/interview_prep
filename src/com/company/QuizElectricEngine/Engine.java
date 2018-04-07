package com.company.QuizElectricEngine;

public interface Engine {
    int rpm = 0;
    default void Start(float averageRpm){
        System.out.println("Rough start " + averageRpm);
    }
    default void Start(double averageRpm){
        System.out.println("Precise start " + averageRpm);
    }
}