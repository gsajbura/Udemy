
public class Switch {

	private boolean isOn;

	public void turnLampOnOff(boolean isOn) {
		this.isOn = isOn;
		this.switchLamp();
	}
	
	private void switchLamp () {
		
		if (isOn)
			System.out.println("Lampa jest w³¹czona");
		else
			System.out.println("Lampa jest wy³¹czona");
	}
}
