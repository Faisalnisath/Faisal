import java.util.Scanner;
public class Problems {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the first Number:");
		int num1= input.nextInt();
		
		System.out.println("Enter the Second Number:");
		int num2= input.nextInt();
		
		int sum = sumFunction1(num1, num2);
		int sum1 = sumFunction2(num1, num2);
		int sum2 = sumFunction3(num1, num2);
		int sum3 = sumFunction4(num1, num2);
		int sum4 = sumFunction5(num1, num2);
		
		System.out.println("Addition of two numbers is: "+sum);
		System.out.println("Subtraction of two numbers is: "+sum1);
		System.out.println("Multiplication of two numbers is: "+sum2);
		System.out.println("Division of two numbers is: "+sum3);
		System.out.println("Modulus of two numbers is: "+sum4);
		
	}
	
	public static int sumFunction1(int num1,int num2) {
		return num1+num2;
	}

	public static int sumFunction2(int num1,int num2) {
		return num1-num2;
	}
	
	public static int sumFunction3(int num1,int num2) {
		return num1*num2;
	}
	
	public static int sumFunction4(int num1,int num2) {
		return num1/num2;
	}
	
	public static int sumFunction5(int num1,int num2) {
		return num1%num2;
	}
	
	
}
	

	
	
