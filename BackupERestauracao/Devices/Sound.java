package BackupERestauracao.devices;

// 4. Sistema de Som

public class Sound {
    public void on() { System.out.println("Sound System is On"); }
    public void off() { System.out.println("Sound System is Off"); }
    public void setCd() { System.out.println("Sound set to CD input"); }
    public void setDvd() { System.out.println("Sound set to DVD input"); }
    public void setRadio() { System.out.println("Sound set to Radio"); }
    public void setVolume(int volume) { System.out.println("Sound volume set to " + volume); }
}