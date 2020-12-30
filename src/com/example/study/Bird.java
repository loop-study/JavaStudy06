package com.example.study;

// 추상 클래스
// 추상이란? 공통적인 특징을 정리한 것
// 독수리, 참새, 비둘기의 공통점은 부리가 있고, 날개가 있고, 깃털이 있다
// 이런 특징을 모아서 클래스로 만든것이 추상클래스다.
// 추상클래스는 class 앞에 abstract 키워드를 붙인다.
public abstract class Bird {

    abstract void sound();

    final void fly() {
        System.out.println("날아간다");
    }
}
