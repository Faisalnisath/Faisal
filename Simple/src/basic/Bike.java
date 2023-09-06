package basic;

public class Bike {
	
		public void run() {
			
			System.out.println("Bike can Park on the Road");
		}
		
public class splendor extends Bike{
		
			public void run() {
			
			System.out.println("Bike can't Park on the Road");
		}
		
	}
		

	public static void main(String[] args) {
		
		Bike obj = new Bike();
		
		obj.run();
		// TODO Auto-generated method stub

	}

}
