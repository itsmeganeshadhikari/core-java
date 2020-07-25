package section7.abstractclassdemo;

public class Test {

	public static void main(String[] args) {
		Animal animal=new Tiger();
		animal.makeSounds();
		animal=new Dog();
		animal.makeSounds();

	}

}
