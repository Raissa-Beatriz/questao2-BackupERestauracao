package BackupERestauracao;

import BackupERestauracao.commands.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private Command slot;
    private static final String LOG_FILE = "command_log.ser"; // Arquivo onde salvaremos

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonPressed() {
        slot.execute(); // 1. Executa
        store(slot);    // 2. Armazena no histórico
    }

    // Método STORE: Adiciona o comando executado ao arquivo de log
    private void store(Command command) {
        List<Command> history = loadHistory(); // Carrega o que já tinha
        history.add(command); // Adiciona o novo
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(LOG_FILE))) {
            out.writeObject(history); // Salva a lista inteira de volta
        } catch (IOException e) {
            System.out.println("Erro ao salvar log: " + e.getMessage());
        }
    }

    // Método LOAD (Auxiliar): Lê o histórico do disco
    @SuppressWarnings("unchecked")
    private List<Command> loadHistory() {
        File file = new File(LOG_FILE);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Command>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    // Método RECOVER: Simula a volta da energia
    public void recover() {
        System.out.println("\n--- PANE ELÉTRICA DETECTADA! INICIANDO RECUPERAÇÃO ---");
        List<Command> history = loadHistory();
        for (Command command : history) {
            command.execute(); // Re-executa cada comando na ordem
        }
        System.out.println("--- SISTEMA RESTAURADO ---\n");
    }
    
    // Método para limpar o log (para testes)
    public void clearLog() {
        new File(LOG_FILE).delete();
    }
}