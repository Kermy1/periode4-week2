package opgave1;
public class RemoteControl {

    // return a command receiver
    public static ElectronicDevice getDevice(String name){
    	ElectronicDevice device = null;
    	switch(name){
	    	case "tv":
	    		device = new Television();
	    		break;
	    	case "stereo":
	    		device = new Stereo();
	    		break;
    	}
    	return device;
    }
}