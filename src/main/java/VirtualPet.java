
public abstract class VirtualPet {

	private int HEALTH_LEVEL = 100;

	protected String petName;
	protected String description;
	protected int happiness;
	protected int health = HEALTH_LEVEL;
	private int hunger;
	private int thirst;
	protected int waste;
	private int amount = 10;

	public VirtualPet(String petName, String description) {

	}

	public VirtualPet(String petName, String description, int happiness, int health) {
		this.petName = petName;
		this.description = description;
		this.happiness = happiness;
		this.health = health;
		this.waste = waste;
	}

	public String getDescription() {
		return description;
	}

	public String getPetName() {
		return petName;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getHealth() {
		return health;
	}

	public int feedPet() {
		hunger += amount;
		thirst -= amount / 2;
		health += amount / 2;
		waste += amount / 2;
		happiness += amount / 3;
		return happiness;

	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int waterPet() {
		thirst += amount;
		health += amount / 2;
		waste += amount / 4;
		happiness += amount / 5;
		return health;
	}

	public int playPet() {
		happiness += amount;
		hunger -= amount / 3;
		thirst -= amount / 3;

		return happiness;
	}

	public int cleanCage() {
		waste -= amount;
		health += amount / 3;
		happiness += amount / 5;
		return waste;

	}

	public void tick() {
		hunger -= 2;
		thirst -= 2;

	}

	public void walk() {
		waste -= 3;
		happiness += 5;
	}
}
