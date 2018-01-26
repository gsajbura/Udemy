
public class Room {

	private Table table;
	private Chair chair;
	private Lamp lamp;

	public Table getTable() {
		return table;
	}

	public Chair getChair() {
		return chair;
	}
	
	public Lamp getLamp() {
		return lamp;
	}

	public Room(Table table, Chair chair, Lamp lamp) {
		super();
		this.table = table;
		this.chair = chair;
		this.lamp = lamp;
	}

}
