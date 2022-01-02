package come.in28minutes.oops.level2.interfaces;

interface Flyable {
	void fly();
}

class Bird implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("with wings");
		
	}
	
}

class Aeroplane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("with fuel");
		
	}
	
}



public class FlyableRunner {
	public static void main(String[] args) {
		Flyable[] flyingObjs= {new Bird(), new Aeroplane()};
		for(Flyable object : flyingObjs) {
			object.fly();
		}
	}

}
