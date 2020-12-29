package com.example.study;

// 자식클래스 뒤에 extends 로 부모클래스 선택
public class SportsCar extends Car {

    public SportsCar() {
        this("페라리", "빨강", "300");
    }

    public SportsCar(String model, String color, String maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // 메소드 오버라이드란? 부모의 메소드를 자식에 맞게 재정의하여 사용하는 기법
    // @Overrid 생략이 가능한 어노테이션
    @Override
    public void move() {
        System.out.println(this.color + " " + this.model + "가 시속 " + maxSpeed + "로 달리고 있다");
    }

    public void carMove() {
        super.move();
    }
}
