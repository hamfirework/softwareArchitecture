package pattern.project.command;

import pattern.project.module.ModuleIF;

public class OffCommand implements Command{

    private final ModuleIF moduleIF;

    public OffCommand(ModuleIF moduleIF) {
        this.moduleIF = moduleIF;
    }

    @Override
    public void execute() {
        moduleIF.turnOff();
    }
}
