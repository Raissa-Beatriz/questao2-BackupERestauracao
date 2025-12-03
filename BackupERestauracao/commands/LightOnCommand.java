package BackupERestauracao.commands;

import BackupERestauracao.devices.*;

// Comando para Ligar Luz

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}