package BackupERestauracao.commands;

import java.io.Serializable;

public interface Command extends Serializable {
    void execute();
    // O método store() e load() serão gerenciados pelo Invoker usando a serialização desta interface
}