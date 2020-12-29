package com.example.study;

import java.util.Scanner;

// 6주차 : 상속
public class JavaStudy06 {

    public static void main(String[] args) {
        // 부모 클래스
        Car car = new Car();
        car.move();

        // 자식 클래스
        SportsCar sportsCar = new SportsCar();
        sportsCar.move();

        sportsCar.carMove();
    }
}
