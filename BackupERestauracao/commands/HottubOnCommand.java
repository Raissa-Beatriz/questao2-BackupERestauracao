package BackupERestauracao.commands;

import BackupERestauracao.devices.*;

// Comando da Banheira

public class HottubOnCommand implements Command {
    Hottub hottub;
    public HottubOnCommand(Hottub hottub) { this.hottub = hottub; }
    public void execute() { 
        hottub.jetsOn(); 
        hottub.circulate(); 
    }  
}
