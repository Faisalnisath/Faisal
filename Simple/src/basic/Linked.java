package basic;
//import java.util.ArrayList;
import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> input = new LinkedList<String>();
		
		input.add("Faisal");
		input.add("Nisath");
		input.add("Anwar");
		input.addFirst("Muhammed");
		input.addLast("Anwar");
		
		input.set(2, "Kalith");
		
		System.out.println(input);
		
	}

}
