package BackupERestauracao.devices;

// 3. Portão da Garagem

import java.io.Serializable; // <--- Importante

public class GarageDoor implements Serializable { // <--- Importante
    String location; // Adicionei location para ficar mais completo, se quiser

    public GarageDoor(String location) {
        this.location = location;
    }
    
    // Construtor vazio caso você tenha usado sem location antes
    public GarageDoor() {
        this.location = "";
    }

    public void up() {
        System.out.println(location + " Garage Door is Up");
    }
    
    public void down() {
        System.out.println(location + " Garage Door is Down");
    }
    
    public void stop() {
        System.out.println(location + " Garage Door Stopped");
    }
}