package opgave1;

public class IncreaseVolume implements Command {
	ElectronicDevice myDevice;
	public IncreaseVolume(ElectronicDevice device) {
		// register receiver
        myDevice = device;
	}

	@Override
	public void execute() {
		myDevice.volumeUp();
	}

	@Override
	public void undo() {
		myDevice.volumeDown();
	}
}
