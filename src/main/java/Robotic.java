
public class Robotic extends VirtualPet {

	private int rustLevel;

	public Robotic(String name, String description, int happiness, int health, int rustLevel) {
		super(name, description, happiness, health);
		this.rustLevel = rustLevel;

	}

	public int oilRoboPets() {
		rustLevel -= 15;
		return rustLevel;

	}

	public int getRustLevel() {
		return rustLevel;
	}

}
