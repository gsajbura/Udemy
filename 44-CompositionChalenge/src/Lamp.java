
public class Lamp {

	private Switch theSwitch;

	public Lamp(Switch theSwitch) {
		super();
		this.theSwitch = theSwitch;
	}

	public void lamp(boolean isOn) {
		theSwitch.turnLampOnOff(isOn);
	}



}
