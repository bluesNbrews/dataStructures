import java.lang.Thread;

public class Greeting extends Thread{
	
	String myName;
	
	public Greeting (String myName){
		this.myName = myName;
	}
	
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println(myName + " says hi!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
