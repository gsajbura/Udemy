
public class Dimensions {
	private int width;
	private int lenght;
	private int hight;
	
	public Dimensions(int width, int lenght, int hight) {
		super();
		this.width = width;
		this.lenght = lenght;
		this.hight = hight;
	}

	public int getWidth() {
		return width;
	}

	public int getLenght() {
		return lenght;
	}

	public int getHight() {
		return hight;
	}
	
	public void printDimensions() {
		System.out.println("Dimensions of table are: " + width + " " + lenght + " " + hight);
	}
	
}
