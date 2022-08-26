package pattern.project.command;

import pattern.project.module.ModuleIF;

public class OnCommand implements  Command {

    private final ModuleIF moduleIF;

    public OnCommand(ModuleIF moduleIF) {
        this.moduleIF = moduleIF;
    }

    @Override
    public void execute() {
        moduleIF.turnOn();
    }
}
