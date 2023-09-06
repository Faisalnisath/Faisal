
public class Student {
	
		String name[];
		int rollno[];
		int marks[];
		
		public int totalMethod(int mark1, int mark2, int mark3) {
			int totalmarks= mark1+mark2+mark3;
			return totalmarks;
			
		}

	public static void main(String[] args) {
		
		Student obj = new Student();
		
		System.out.println(obj.totalMethod(35, 78, 56));
		

	}

}
