package opgave1;
// invoker
public class DeviceButton {

    public void execute(Command cmd){

        System.out.println("Device execute button is pressed !");
        cmd.execute();
    }

    public void undo(Command cmd){
    	System.out.println("Device undo button is pressed !");
        cmd.undo();
    }
}