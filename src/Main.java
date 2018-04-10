
import devices.*;
import remotes.*;
public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        System.out.println("********* Welcome back, turning up TV and pressed the power Button *********"+"\n");
        testPower(new SamsungTv());
        System.out.println("********* Now the user want to mute the TV *********"+"\n");
        testMute(new SamsungTv());
        System.out.println("********* Welcome back, turning up Radio and pressed the power Button *********"+"\n");
        testPower(new Radio());
        System.out.println("********* Now the user want to mute the Radio *********"+"\n");
        testMute(new Radio());
        System.out.println("********* Welcome back, turning up another TV and pressed the power Button *********"+"\n");
        testPower(new SonyTv());
        System.out.println("********* Now the user want to mute the second TV *********"+"\n");
        testMute(new SonyTv());

    }

    public static void testPower(Device device){
        //assume user pressed the power button on remote control
        System.out.println("Testing with power button.");
        BasicRemote basicRemote=new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

    }
    public static void testMute(Device device){
        //assume user pressed the mute button on remote control
        System.out.println("Testing with mute.");
        BasicRemote basicRemote=new BasicRemote(device);
        basicRemote.mute();
        device.printStatus();
    }


}
