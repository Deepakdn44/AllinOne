package superkeyword;

public class Dog extends Animal{
	
	
	public Dog(int x) {
		System.out.println("Dog Constructor");
	}
	
	public void sound() {
		super.sound();
		System.out.println("Dog Sound!!");
	}

}
