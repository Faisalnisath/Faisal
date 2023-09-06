package basic;

import java.util.Arrays;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Faisal";
		String lastName = "Nisath";
		
		System.out.println(firstName.concat(lastName));
		
		String name="Tanvir";
		String Name="Malik";
		
		System.out.println(firstName.equals(lastName));
		
		String words= "Hi I Am There";
		System.out.println(words.replace("Hi", "Hello"));
		
		String Words= "Hi I Am There";
		System.out.println(words.replaceAll("Hi I Am There", "Go Ahead"));
		
		String letters= "FAISAL";
		System.out.println(letters.toLowerCase());
		System.out.println(letters.length());
		
		String totalletters= "FAISAL NISATH";
		String [] result= totalletters.split(" ");
		System.out.println(Arrays.toString(result));

		

		



	}

}
