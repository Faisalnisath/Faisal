package simplepro;


public class Grandfather {

		public void Student(int id) {
			System.out.println(id);
		}
		
		public void Student(String name) {
			System.out.println(name);
		}
		
		public void Student(int number, double phoneNumber) {
			System.out.println(number);

		}
		
		public void Student(float length) {
			System.out.println(length);

		}
		
		public void Student(double breadth) {
			System.out.println(breadth);

		}
		
		
		
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grandfather obj = new Grandfather();
		
		obj.Student(2);
		obj.Student("faisal");
		obj.Student(5432 , 6381249);
		obj.Student(2.4f);
		obj.Student(3.14);

	}

}
