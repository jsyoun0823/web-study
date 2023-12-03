package DesignPattern.MVVM.command;

public class CommandPatternExample {

    public static void main(String[] args) {

        // Receiver 객체 생성
        Light light = new Light();

        // 각각의 ConcreteCommand 객체 생성
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        // Invoker 객체 생성
        RemoteController remoteController = new RemoteController();

        // 특정 커맨드(불을 켜는 커맨드) 설정 후 실행
        remoteController.setCommand(lightOnCommand);
        remoteController.pressButton();

        // 다른 커맨드(불을 끄는 커맨드) 설정 후 실행
        remoteController.setCommand(lightOffCommand);
        remoteController.pressButton();
    }
}