package come.in28minutes.oops.level2.interfaces;

public class Mario implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("goes into a hole");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("go forward");
	}

}
