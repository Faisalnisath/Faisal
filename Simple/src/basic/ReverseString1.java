package basic;
public class ReverseString1 {

	public static void main(String[] args) {
		
		String name ="Faisal";
		String rs=" ";
		char ch;
		
		 for (int i=0; i<name.length(); i++)
	      {
	        ch= name.charAt(i); //extracts each character
	        rs= ch+rs; //adds each character in front of the existing string
	      }
	
		
		System.out.println(rs);
		
		

	
}
}
