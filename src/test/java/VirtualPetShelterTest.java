import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPet pet = new VirtualPet("name", "description", 10, 10);
	VirtualPetShelter testShelter = new VirtualPetShelter();

	@Test

	public void shouldAddPetToShelter() {
		int numberOfPetsBefore = testShelter.getPetCount();

		testShelter.addPet(pet);
		int numberOfPetsAfter = testShelter.getPetCount();

		assertThat(numberOfPetsAfter, is(equalTo(numberOfPetsBefore + 1)));
	}

	@Test
	public void testOilAllRoboPets() throws Exception {
		throw new RuntimeException("not yet implemented");
	}
	
}
