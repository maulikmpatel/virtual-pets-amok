import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private int waste = 20;
	private int shelterLitterBox = 20;
	Map<String, VirtualPet> pets = new HashMap<>();

	public int getPetCount() {

		return pets.size();
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);

	}

	public Collection<VirtualPet> getPets() {
		return pets.values();

	}

	public VirtualPet getOnePet(String petName) {
		return pets.get(petName);

	}

	public void adoptPet(String petName) {
		pets.remove(petName);

	}

	public void feedAllPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).feedPet();
			}
		}
	}

	public void feedOnePet(String petName) {
		getOnePet(petName).feedPet();

	}

	public void waterAllPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).waterPet();
			}
		}
	}

	public void waterOnePet(String petName) {
		getOnePet(petName).waterPet();

	}

	public void playAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.playPet();
		}
	}

	public void playOnePet(String petName) {
		getOnePet(petName).playPet();

	}

	public void cleanOneCage(String petName) {
		getOnePet(petName).cleanCage();
	}

	public void cleanAllCages() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog || pet instanceof RoboDog) {
				((VirtualPet) pet).cleanCage();
			}
		}
	}

	public void oilAllRoboPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof RoboDog || pet instanceof RoboCat) {
				((Robotic) pet).oilRoboPets();
			}
		}
	}

	public void cleanLitterBox() {
		setShelterLitterBox(0);
	}

	public int getShelterLitterBox() {
		return shelterLitterBox;
	}

	public void setShelterLitterBox(int shelterLitterBox) {
		this.shelterLitterBox = shelterLitterBox;
	}

	public int getWaste() {
		return waste;
	}

	public void allPetTick() {
		for (VirtualPet pet : pets.values()) {
			pet.tick();
			shelterLitterBox += 3;
			waste += 3;
		}
	}

	public void walkAllDogs() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog || pet instanceof RoboDog) {
				((VirtualPet) pet).walk();
			}
		}
	}

	public String petStatus() {
		String petStatus = "";
		for (VirtualPet pet : pets.values()) {
			petStatus += pet.getPetName() + "\t|	" + pet.getDescription() + "	\t|		" + pet.getHappiness()
					+ "	\t|	" + pet.getHealth() + "	\t|\n";

		}
		return ("Name \t|	Description				\t|		Happiness\t|	Health \n" + petStatus);
	}

	public String shortDescription() {
		String shortDescription = "";
		for (VirtualPet pet : pets.values()) {
			shortDescription += pet.getPetName() + "\t|	" + pet.getDescription() + "\n";
		}
		return shortDescription;
	}

	public String petOptions() {
		return ("what would you like to do?\npress 1 to clean LitterBox. \t\tpress 5 to feed all pets. \npress 2 to Oil All RoboPets. \t\tpress 6 to water all pet \npress 3 to clean all cages. \t\tpress 7 to play with all pets. \npress 4 to Adopt a pet. \t\tpress 8 to place a pet for adoption.\npress 9 for status of all pets. \tpress 0 to Exit.");

	}

}
