package section12.instanceofdemo;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("dog barks");
	}
	
	public void wags() {
		System.out.println("dog wags");
	}

}
