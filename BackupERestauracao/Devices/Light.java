package BackupERestauracao.devices;

import java.io.Serializable; // <--- 1. ADICIONE ISSO

// 1. Iluminação

public class Light implements Serializable { // <--- 2. ADICIONE ISSO
    String location;
    
    public Light(String location) { 
        this.location = location; 
    }

    public void on() { 
        System.out.println(location + " Light is On"); 
    }
    
    public void off() { 
        System.out.println(location + " Light is Off"); 
    }
}