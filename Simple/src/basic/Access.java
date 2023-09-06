package basic;

public class Access implements Studentdetails {

		public void studentname() {
		System.out.println("Student Name is Faisal");
		
		}
		public void studentAge() {
		System.out.println("Student Age is: 22");
		
		}
		public void studentmail() {
		System.out.println("Student mail is: nisathfaisal@gmail.com");
		
		}
		public void studentnumber() {
		System.out.println("Student Name is: 6381249227");
		
		}
	
		public static void main(String[] args) {
		
		Access obj = new Access();
		
		obj.studentname();
		obj.studentAge();
		obj.studentmail();
		obj.studentnumber();
		
		}

}
