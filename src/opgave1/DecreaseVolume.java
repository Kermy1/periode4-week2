package opgave1;

public class DecreaseVolume implements Command {
	ElectronicDevice myDevice;
	public DecreaseVolume(ElectronicDevice device) {
		// register receiver
        myDevice = device;
	}

	@Override
	public void execute() {
		myDevice.volumeDown();
	}

	@Override
	public void undo() {
		myDevice.volumeUp();
	}

}
