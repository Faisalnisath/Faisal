package basic;

public class Vowels {
	
	public static void main(String[]args) {
		
		String letters = "Hi i am Welcome";
		
		for(int i=0;i<letters.length();i++ ) {
			
			if(letters.charAt(i)=='a'||letters.charAt(i)=='e'||letters.charAt(i)=='i'||letters.charAt(i)=='o'
					||letters.charAt(i)=='u') {
				
				System.out.println("vowels are:" + letters.charAt(i));
			}
			
		}
		
		
		
	}

}
