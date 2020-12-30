package com.example.study;

import sun.corba.Bridge;

import java.util.Scanner;

// 6주차 : 상속
public class JavaStudy06 {

    public static void main(String[] args) {
        /*
        // 부모 클래스
        Car car = new Car();
        car.move();

        // 자식 클래스
        SportsCar sportsCar = new SportsCar();
        sportsCar.move();

        sportsCar.carMove();
        */

        // Bird bird = new Bird(); // 추상 클래스는 인스턴스를 가질 수가 없다.
    }
}

// 추상클래스는 상속을 목적으로 사용된다.
// 추상메소드는 반드시 재정의해야한다.
class 독수리 extends Bird {

    @Override
    void sound() {
        System.out.println("독수리");
    }

    /*
    // final method 는 재정의 할 수 없다. 에러가 발생함.
    void fly() {

    }*/
}

class 참새 extends Bird {

    @Override
    void sound() {
        System.out.println("참새");
    }
}

class 비둘기 extends Bird {

    @Override
    void sound() {
        System.out.println("비둘기");
    }
}

