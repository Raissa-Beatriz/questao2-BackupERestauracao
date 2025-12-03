package BackupERestauracao.Devices;

// 5. TV

public class TV {
    String location;
    public TV(String location) { this.location = location; }
    public void on() { System.out.println(location + " TV is On"); }
    public void off() { System.out.println(location + " TV is Off"); }
    public void setInputChannel() { System.out.println(location + " TV channel set"); }
    public void setVolume(int volume) { System.out.println(location + " TV volume set to " + volume); }
}