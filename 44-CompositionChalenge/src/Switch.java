
public class Switch {

	private boolean isOn;

	public void turnLampOnOff(boolean isOn) {
		this.isOn = isOn;
		this.switchLamp();
	}
	
	private void switchLamp () {
		
		if (isOn)
			System.out.println("Lamp is ON");
		else
			System.out.println("Lamp is OFF");
	}
}
