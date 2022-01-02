package come.in28minutes.oops.level2.interfaces;


abstract class Animal{
	abstract void bark();
	
}

class Dog extends Animal{

	@Override
	void bark() {
		// TODO Auto-generated method stub
		System.out.println("Bow Bow");
	}
	
}

class Cat extends Animal{

	@Override
	void bark() {
		// TODO Auto-generated method stub
		System.out.println("Mew Mew");
	}
	
}



public class AnimalRunner {
	
	
	public static void main(String[] args) {
		Animal[] animals= {new Dog(),new Cat()};
		for(Animal animal:animals) {
			animal.bark();
		}
	}

}
