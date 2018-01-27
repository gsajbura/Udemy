
public class Car {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			Car car = randomCar();
			System.out.println("Car number #" + i + " is " + car.getName());
			car.startEngine();
			car.accelerate();
			System.out.println(car.getWheels());
			System.out.println();
		}

	}

	public static Car randomCar() {
		int randomNumber = (int) (Math.random() * 3 + 1);
		System.out.println("Random number generated is: " + randomNumber);
		switch (randomNumber) {
		case 1:
			return new CarreraGT();
		case 2:
			return new Alpha159();
		case 3:
			return new Focus();
		}
		return new Car("Car", 4);
	}

	private String name;
	private int wheels = 4;
	private boolean engine;
	private int cylinders;

	public Car(String name, int cylinders) {
		this.name = name;
		this.cylinders = cylinders;
		this.engine = true;
	}

	public void startEngine() {
		System.out.println(this.getName() + " starting " + this.getCylinders() + " cylinders");
	}

	public void accelerate() {
		System.out.println(this.getName() + " accelerating");
	}

	public String getName() {
		return name;
	}

	public int getCylinders() {
		return cylinders;
	}
	
	public int getWheels() {
		return wheels;
	}

}

class CarreraGT extends Car {

	public CarreraGT() {
		super("CarreraGT", 10);
	}

}

class Alpha159 extends Car {

	public Alpha159() {
		super("Alpha159", 6);
	}
}

class Focus extends Car {

	public Focus() {
		super("Focus", 4);
	}

}
