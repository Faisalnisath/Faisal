package simplepro;

public class son1 extends father {

	public void studentname() {
		System.out.println("Nisath");
		
	}
	public void studenteducation() {
		
		System.out.println("B.E");

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son1 details= new son1();
		
	/*	details. sonName();
		details. sonEducation();*/
		details.studentname();
		details.studenteducation();
		details.business();
	/*	details.money();
		details.city(); */
	}

}
