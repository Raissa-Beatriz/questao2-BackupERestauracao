package BackupERestauracao.devices;

// 5. TV

import java.io.Serializable; // <--- Importante

public class TV implements Serializable { // <--- Importante
    String location;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is On");
    }
    
    public void off() {
        System.out.println(location + " TV is Off");
    }
    
    public void setInputChannel() {
        System.out.println(location + " TV channel set");
    }
    
    public void setVolume(int volume) {
        System.out.println(location + " TV volume set to " + volume);
    }
}