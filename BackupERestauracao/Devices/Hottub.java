package BackupERestauracao.devices;

// 6. Banheira (Hottub)

import java.io.Serializable; // <--- Importante

public class Hottub implements Serializable { // <--- Importante
    
    public void circulate() {
        System.out.println("Hottub is bubbling!");
    }
    
    public void jetsOn() {
        System.out.println("Hottub jets are ON");
    }
    
    public void jetsOff() {
        System.out.println("Hottub jets are OFF");
    }
    
    public void setTemperature(int temp) {
        System.out.println("Hottub temperature set to " + temp);
    }
}