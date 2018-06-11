import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);
		boolean gameOn = true;
		Map<String, VirtualPet> pets = new HashMap<>();

		VirtualPet pet1 = new RoboDog("Tom", "Tons of energy, Loves to play fetch", 60, 60, 60);
		VirtualPet pet2 = new OrganicDog("Dick", "Is a lazy puppy, great to cuddle with", 50, 50, 50, 50);
		VirtualPet pet3 = new OrganicCat("Harry", "Like to name says, NOT REALLY A CAT", 40, 40, 40, 40);
		VirtualPet pet4 = new RoboCat("Shadow", "Black cats are badluck,are you a witch", 20, 20, 40);
		virtualPetShelter.addPet(pet1);
		virtualPetShelter.addPet(pet2);
		virtualPetShelter.addPet(pet3);
		virtualPetShelter.addPet(pet4);

		System.out.println("Welcome to Patel's Pet Shoppe");
		System.out.println("Currently we have the following pets available for adoption.");
		System.out.println("Name \t| Type 	\t| 	Happiness \t| Health ");
		System.out.println("Tom \t| Dog 	\t| 	60 	\t| 	60 ");
		System.out.println("Harry \t| NOT CAT\t| 	40 	\t| 	40 ");
		System.out.println("Shadow \t| black cat \t| 	20 	\t|	40 ");
		System.out.println("Dick \t| Dog 	\t| 	50	 \t| 	50 ");
		System.out.println(virtualPetShelter.petOptions());
//System.out.println(virtualPetShelter.findRoboPets());
		while (gameOn == true) {
			String userAction = input.nextLine();

			if (userAction.equals("1")) {
				virtualPetShelter.cleanLitterBox();
				System.out.println("you have cleaned the Shelter LitterBox");
				System.out.println("LitterBox is now at "+virtualPetShelter.getShelterLitterBox());
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("2")) {
				virtualPetShelter.oilAllRoboPets();
				System.out.println("you have oiled " + pet1 + " and "+ pet4);
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("3")) {
				virtualPetShelter.cleanAllCages();
				System.out.println("you have cleaned all of the cages");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("5")) {
				virtualPetShelter.feedAllPets();
				System.out.println("you have feed all the pets.");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("6")) {
				virtualPetShelter.waterAllPets();
				System.out.println("you have wated all the pets.");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("7")) {
				virtualPetShelter.playAllPets();
				System.out.println("you have played with all the pets.");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("4")) {
				System.out.println("Please type the name of pet you wish to adopt.");
				String userActionpet = input.nextLine();
				virtualPetShelter.adoptPet(userActionpet);
				System.out.println("Congratulations!!! you are not the proud parent of " + userActionpet + ".");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("8")) {
				System.out.println("please type name of pet.");
				String userActionPet = input.nextLine();
				System.out.println("please describe this pet.");
				String userDescription = input.nextLine();
				System.out.println(
						"Please enter pet class. press 1 for Dog, press for 2 for Cat, press 3 for RoboCat, press 4 for RoboDog");
				String newPet = input.nextLine();
				if (newPet.equals("1")) {
					virtualPetShelter.addPet(new OrganicDog(userActionPet, userDescription, 50, 50, 50, 50));
				} else if (newPet.equals("2")) {
					virtualPetShelter.addPet(new OrganicCat(userActionPet, userDescription, 50, 50, 50, 50));
				} else if (newPet.equals("3")) {
					virtualPetShelter.addPet(new RoboCat(userActionPet, userDescription, 50, 50, 50));
				} else if (newPet.equals("4")) {
					virtualPetShelter.addPet(new RoboDog(userActionPet, userDescription, 50, 50, 50));
				}
				System.out.println("Thank you for adding " + userActionPet + " to our shelter.");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("9")) {
				System.out.println(virtualPetShelter.petStatus());
				System.out.println(virtualPetShelter.petOptions());
				continue;
			}
			if (userAction.equals("0")) {
				System.out.println("Thank you for visiting Patel's WE DONT HAVE ANY CATS Shoppe");
				System.out.println("Please come again");
				System.exit(0);
			}
			virtualPetShelter.allPetTick();

		}
	}

}
