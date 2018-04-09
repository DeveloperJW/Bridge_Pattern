/**
 * Define some basic control activities of remote controller
 * connect with device and define methods to control devices
 */
package remotes;

import devices.Device;

public class BasicRemote implements Remote{
    protected Device device;
    public BasicRemote(){
        //default constructor
    }

    public BasicRemote(Device device){
        this.device=device;
    }

    @Override
    public void power() {
        System.out.println("The power key is pressed. ");
        if (device.isEnabled()){
            //if the device is turned on, then pressing the power key will disable device
            device.disable();
        } else{
            device.enable();
        }
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: Volume Up");
        device.setVolume(device.getVolume()+1);

    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: Volume Down");
        device.setVolume(device.getVolume()-1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: switch to next channel");
        device.setChannel(device.getChannel()+1);

    }

    @Override
    public void ChannelDown() {
        System.out.println("Remote: switch to previous channel");
        device.setChannel(device.getChannel()-1);

    }
    //added mute operation
    public void mute(){
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
