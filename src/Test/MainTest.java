package Test;
import devices.Device;
import devices.SamsungTv;
import devices.SonyTv;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import remotes.BasicRemote;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void main() {

    }

    @org.junit.jupiter.api.Test
    /**
     * This method checks if the default channel is 1
     */
    void testDefaultChannel() {
        Device device=new SamsungTv();
        assertEquals(device.getChannel(),1);
    }

    @org.junit.jupiter.api.Test
    /**
     * This method checks if the channel is 2 after user pressing channel up button
     */
    void testAddChannel(){
        Device device=new SamsungTv();
        BasicRemote basicRemote=new BasicRemote(device);
        basicRemote.channelUp();
        assertEquals(device.getChannel(),2);
    }

    @org.junit.jupiter.api.Test
    /**
     * This method checks if the channel is 6 after user pressing channel up button 5 times
     */
    void testAdd5Channel(){
        Device device=new SamsungTv();
        BasicRemote basicRemote=new BasicRemote(device);
        basicRemote.channelUp();
        basicRemote.channelUp();
        basicRemote.channelUp();
        basicRemote.channelUp();
        basicRemote.channelUp();
        assertEquals(device.getChannel(),6);
    }
    @org.junit.jupiter.api.Test
    /**
     * This method checks if the channel is 31 after user pressing channel up button 1 time
     */
    void testTurnUpVolume(){
        Device device=new SonyTv();
        BasicRemote basicRemote=new BasicRemote(device);
        basicRemote.volumeUp();
        assertEquals(device.getVolume(),31);
    }

    @org.junit.jupiter.api.Test
    /**
     * This method checks if the default channel is 1
     */
    void testDefaultVolume() {
        Device device=new SonyTv();
        assertEquals(device.getVolume(),30);
    }

    @org.junit.jupiter.api.Test
    /**
     * This method checks if the channel is 40 after user pressing channel up button 10 time
     */
    void testTurnUpVolume10Times(){
        Device device=new SonyTv();
        BasicRemote basicRemote=new BasicRemote(device);
        int count=10;
        for (int i=0;i<count;i++){
            basicRemote.volumeUp();
        }
        assertEquals(device.getVolume(),403);
    }


}