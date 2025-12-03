package BackupERestauracao.commands;

import BackupERestauracao.devices.*;

// Comando para Ligar Som

public class SoundOnCommand implements Command {
    Sound sound;
    public SoundOnCommand(Sound sound) { this.sound = sound; }
    public void execute() { sound.on(); }
}