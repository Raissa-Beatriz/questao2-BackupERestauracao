package BackupERestauracao;

import BackupERestauracao.devices.*;
import BackupERestauracao.commands.*;
public class Main {
    public static void main(String[] args) {
        // 1. Configuração Inicial (Hardware)
        RemoteControl remote = new RemoteControl();
        remote.clearLog(); // Começar limpo para o teste

        Light livingRoomLight = new Light("Living Room");
        TV livingRoomTV = new TV("Living Room");
        CeilingFan fan = new CeilingFan("Living Room");
        
        // 2. Criar Comandos
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command tvOn = new TVOnCommand(livingRoomTV);
        Command fanHigh = new CeilingFanHighCommand(fan);

        // 3. Simulação de Uso (Dia a dia)
        System.out.println("--- Usando o controle remoto normalmente ---");
        
        remote.setCommand(lightOn);
        remote.buttonPressed(); // Liga luz e GRAVA

        remote.setCommand(tvOn);
        remote.buttonPressed(); // Liga TV e GRAVA

        remote.setCommand(fanHigh);
        remote.buttonPressed(); // Liga ventilador e GRAVA

        // 4. Simulação da Falha
        System.out.println("\n... O sistema caiu. Reiniciando aplicação ...");
        
        // Imagine que o programa fechou aqui. 
        // Ao criar um novo controle, ele não sabe o estado dos objetos, 
        // mas o método recover() vai buscar no disco.
        
        RemoteControl newRemoteAfterFailure = new RemoteControl();
        newRemoteAfterFailure.recover();
    }
}