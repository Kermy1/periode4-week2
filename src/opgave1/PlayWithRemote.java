package opgave1;
// the client
public class PlayWithRemote{

    public static void main(String[] args){

        // create command receiver
        ElectronicDevice newDevice = RemoteControl.getDevice("stereo");

        // create a concrete command, register the receiver
        TurnTVOn onCommand = new TurnTVOn(newDevice);

        // create invoker
        DeviceButton b = new DeviceButton();

        // invoke command
        b.execute(onCommand);

        IncreaseVolume volumeCommand = new IncreaseVolume(newDevice);
        b.execute(volumeCommand);
        b.execute(volumeCommand);
        b.execute(volumeCommand);
        b.undo(volumeCommand);

        // create another concrete command
        TurnTVOff offCommand = new TurnTVOff(newDevice);

        // invoke another concrete command
        b.execute(offCommand);
    }
}