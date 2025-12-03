package BackupERestauracao.commands;

import BackupERestauracao.devices.*;

// Comando para Armar Segurança

public class SecurityArmCommand implements Command {
    SecurityControl security;
    public SecurityArmCommand(SecurityControl security) { this.security = security; }
    public void execute() { security.arm(); }
}