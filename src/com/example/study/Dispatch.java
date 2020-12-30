package com.example.study;

import java.util.Arrays;
import java.util.List;

// 메소드 디스패치
public class Dispatch {
/*
    // static method dispatch 예시.
    static class Service {
        void run() {
            System.out.println("run()");
        }

        void run(String msg) {
            System.out.println("run(" + msg +")");
        }
    }

    public static void main(String[] args) {
        new Service().run();
        new Service().run("Dispatch");
    }
*/

    // dynamic method dispatch 예시
    static abstract class Service {
        abstract void run();
    }

    static class MyService1 extends Service {
        @Override
        void run() {
            System.out.println("run1");
        }
    }

    static class MyService2 extends Service {
        @Override
        void run() {
            System.out.println("run2");
        }
    }

    public static void main(String[] args) {
        Service svc = new MyService1();

        svc.run();  // receiver parameter
    }

}
