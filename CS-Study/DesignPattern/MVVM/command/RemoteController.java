package DesignPattern.MVVM.command;

// Invoker 클래스
public class RemoteController {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}