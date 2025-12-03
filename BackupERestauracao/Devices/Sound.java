package BackupERestauracao.devices;

// 4. Sistema de Som

import java.io.Serializable; // <--- Importante

public class Sound implements Serializable { // <--- Importante
    String location;

    public Sound(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Sound System is On");
    }
    
    public void off() {
        System.out.println(location + " Sound System is Off");
    }
    
    public void setCd() {
        System.out.println(location + " Sound set to CD input");
    }
    
    public void setDvd() {
        System.out.println(location + " Sound set to DVD input");
    }
    
    public void setRadio() {
        System.out.println(location + " Sound set to Radio");
    }
    
    public void setVolume(int volume) {
        System.out.println(location + " Sound volume set to " + volume);
    }
}