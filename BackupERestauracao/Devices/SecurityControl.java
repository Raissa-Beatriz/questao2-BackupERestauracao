package BackupERestauracao.devices;

// 7. Segurança

import java.io.Serializable; // <--- Importante

public class SecurityControl implements Serializable { // <--- Importante
    
    public void arm() {
        System.out.println("Security System ARMED");
    }
    
    public void disarm() {
        System.out.println("Security System DISARMED");
    }
}