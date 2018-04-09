
import devices.*;
import remotes.*;
public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        testDevice(new Tv());
        testDevice(new Radio());

    }
    public static void testDevice(Device device){
        System.out.println("Testing with power.");
        BasicRemote basicRemote=new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Testing with mute.");
        BasicRemote basicRemote1=new BasicRemote(device);
        basicRemote1.mute();
        device.printStatus();
    }
}
