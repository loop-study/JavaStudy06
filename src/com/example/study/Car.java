package com.example.study;

public class Car {
    public String model;
    public String color;
    public String maxSpeed;

    public Car() {
        this("승용차", "검정", "200");
    }

    public Car(String model, String color, String maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        System.out.println(this.model + "가 이동중");
    }
}
