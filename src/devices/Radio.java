/**
 * Radio has both volume and channel, define TV based on Device
 */

package devices;

public class Radio implements Device{
    private boolean on=false;
    private int volume=30;
    private int channel=1;


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
        channel=newChannel;

    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------------");
        System.out.println("| The status of radio: ");
        System.out.println("| the radio is turned "+(on? "on" : "off"));
        System.out.println("| The current volume: "+volume+" %");
        System.out.println("| The current channel is: "+channel);
        System.out.println("------------------------------------------");

    }
}
