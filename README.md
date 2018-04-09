# Bridge_Pattern

According to the definition, Bridge Pattern decouples the abstraction and implementation by creating two different hierarchies.
Also, bridge Pattern is used up-front in a design to let abstractions and implementations vary independently. 
By applying Bridge Pattern, we can create an “extensible system”.

As we talked during class, TV and remote controller is a classical example for Bridge_Pattern, therefore, I did some research and 
come up with the Device and Controller project and implemented using Bridge Pattern. 

  Suppose we have devices such as TV, Bluetooth Speaker or Radio, and we would like to have a remote controller to adjust the volume,
switching channels or power on/off the device. 
  In the old way, we need to write control methods under different devices/classes, we have to write control methods under TV, Speaker 
and Radio. However, with bridge pattern, we can simply the code and make it more extensible.
