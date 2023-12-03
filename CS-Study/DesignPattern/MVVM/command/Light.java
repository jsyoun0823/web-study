package DesignPattern.MVVM.command;

// 실제 작업을 수행하는 Receiver 클래스
public class Light {
    public void turnOn() {
        System.out.println("불이 켜져요");
    }

    public void turnOff() {
        System.out.println("불이 꺼져요");
    }
}