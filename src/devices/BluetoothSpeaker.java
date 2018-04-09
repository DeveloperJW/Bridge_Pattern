package devices;

/**
 * Bluetooth Speaker do not have channel, so the default channel and setChannel method return 0
 */

public class BluetoothSpeaker implements Device {
    private boolean on=false;
    private int volume=30;
    private int channel=0;


    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on=true;

    }

    @Override
    public void disable(){
        on=false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int newVolume) {
        volume=newVolume;

    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int newChannel) {
        channel=0;

    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------------");
        System.out.println("| The status of Bluetooth Speaker: ");
        System.out.println("| the radio is turned "+(on? "on" : "off"));
        System.out.println("| The current volume: "+volume+" %");
        System.out.println("------------------------------------------");

    }
}
