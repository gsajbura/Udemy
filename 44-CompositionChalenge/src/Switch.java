
public class Switch {

	private boolean isOn;

	public void turnLampOnOff(boolean isOn) {
		this.isOn = isOn;
		this.switchLamp();
	}
	
	private void switchLamp () {
		
		if (isOn)
			System.out.println("Lampa jest w��czona");
		else
			System.out.println("Lampa jest wy��czona");
	}
}
