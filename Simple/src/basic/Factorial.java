package basic;

public class Factorial {

	public static void main(String[] args) {
		int i, num=5, sum=1; 
		
		
		for(i=1; i<=num ; i++) {
			
			sum=sum*i;
			
		}
		
		System.out.println("Factorial of " + num +" is:"  + sum);

	}

}
