package BackupERestauracao.commands;

import BackupERestauracao.devices.*; 

// Comando para Ligar TV

public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}