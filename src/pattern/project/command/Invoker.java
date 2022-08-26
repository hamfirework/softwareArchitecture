package pattern.project.command;

public class Invoker {

    Command onCmd;
    Command offCmd;

    public void setCommand(Command onCmd, Command offCmd) {
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
