/**
 * Light should only have the power on/off behavior
 * so the volume and channel are defined as 0 as default
 */

package devices;

public class Light implements Device {
    private boolean on=false;
    private int volume=0;
    private int channel=0;

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {
        on=true;
    }

    @Override
    public void disable() {
        on=false;

    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void setVolume(int percent) {
        volume=0;
    }

    @Override
    public int getChannel() {
        return 0;
    }

    @Override
    public void setChannel(int channel) {
        channel=0;

    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------------");
        System.out.println("| The status of Light: ");
        System.out.println("| the Light is turned "+(on? "on" : "off"));
        System.out.println("------------------------------------------");

    }
}
