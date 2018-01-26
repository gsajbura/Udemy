
public class RoomMain {

	public static void main(String[] args) {
		Room room = new Room(new Table(new Dimensions(1200, 800, 500)), new Chair(4, 2), new Lamp(new Switch()));
		room.getTable().getDimensions().printDimensions();
		room.getChair().printChair();
		room.getLamp().lamp(true);
	}

}
