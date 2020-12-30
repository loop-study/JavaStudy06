package com.example.study;

public class FinalExample {
    public final String name = "현철";

    /*void setName(String name) {
        this.name = "final";
    }*/

    public static void main(String[] args) {
        BigBird bb = new BigBird();

    }
}


final class BigBird {
    void sound() {
        System.out.println("지저귄다");
    }
}

/*// 자식을 가질 수 없는 final 클래스
class egg extends BigBird{

}*/
