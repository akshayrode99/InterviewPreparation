package Abstraction;

public class Dog extends Demo {
	
	public void animalSound() {
		
		
		System.out.println("The Dog says :- Bhao..Bhao");
	} 
	
	@Override
	public void walk() {
		
		System.out.println("The Dog walk :- Fast");
	}
	 
	public static void main(String[] args) {
		
		Dog obj = new Dog ();
		
		obj.animalSound();
		obj.sleep();
		obj.walk();
	}

}
