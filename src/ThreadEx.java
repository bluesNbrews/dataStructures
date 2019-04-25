public class ThreadEx {
	
	public static void main(String[] args) {
	
	Greeting Jack = new Greeting("Jack");
	Greeting Jill = new Greeting("Jill");
	
	new Thread(Jack).start();
	
	new Thread(Jill).start();
	}
}
