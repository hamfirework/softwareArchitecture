package design.behavioral.command;

public class Invoker {
    Command onCmd;
    Command offCmd;

    public void setCommand(Command onCmd, Command offCmd) {
        // 명령어들을 스택형식으로 구현하는 것도 가능.
        this.onCmd = onCmd;
        this.offCmd = offCmd;
    }

    void on() {
        this.onCmd.execute();
    }

    void off() {
        this.offCmd.execute();
    }
}