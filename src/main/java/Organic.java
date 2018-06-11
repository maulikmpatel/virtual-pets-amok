import java.util.HashMap;
import java.util.Map;

public class Organic extends VirtualPet {
	Map<String, VirtualPet> organicPets = new HashMap<>();
	private int hunger;
	private int thirst;
	private int waste;
	protected int amount = 10;

	public Organic(String name, String description, int happiness, int health, int hunger, int thirst) {
		super(name, description, happiness, health);
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;

	}

	public int feedPet() {
		hunger += amount;
		thirst -= amount / 2;
		health += amount / 2;
		waste += amount / 2;
		happiness += amount / 3;
		return happiness;

	}

	public int waterPet() {
		thirst += amount;
		health += amount / 2;
		waste += amount / 4;
		happiness += amount / 5;
		return thirst;
	}

	public int cleanCage() {
		waste -= amount;
		health += amount / 3;
		happiness += amount / 5;
		return waste;

	}

	
}
