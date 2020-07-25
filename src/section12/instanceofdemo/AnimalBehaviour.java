package section12.instanceofdemo;

public class AnimalBehaviour {

	public void getAnimalBehaviour(Animal animal) {

		if (animal instanceof Tiger) {
			Tiger tiger = (Tiger) animal;
			tiger.makeSound();
			tiger.stripes();
		}
		
		else if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.makeSound();
			dog.wags();
		}
	}
}
