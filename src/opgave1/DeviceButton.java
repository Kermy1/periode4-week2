package opgave1;

import java.util.Stack;

// invoker
public class DeviceButton {
	private Stack<Command> commandLog;
	public DeviceButton(){
		commandLog = new Stack<Command>();
	}

    public void execute(Command cmd){
        System.out.println("Device execute button is pressed !");
        cmd.execute();
        commandLog.push(cmd);
    }

    public void undo(){
    	System.out.println("Device undo button is pressed !");
    	commandLog.pop().undo();
    }
}