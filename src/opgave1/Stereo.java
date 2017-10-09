package opgave1;

public class Stereo implements ElectronicDevice{
	private int volume = 0;
	public Stereo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void on() {
		System.out.println("stereo turned on");
	}

	@Override
	public void off() {
		System.out.println("stereo turned off");
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("stereo volume is at: "+volume);
	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("stereo volume is at: "+volume);
	}

}
