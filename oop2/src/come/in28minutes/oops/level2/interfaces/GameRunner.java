package come.in28minutes.oops.level2.interfaces;

public class GameRunner{
	public static void main(String[] args) {
		GamingConsole[] games= {new Mario(),new Chess()};
		for(GamingConsole game:games) {
			game.down();
			game.up();
			game.left();
			game.right();
		}
		
	}

}
