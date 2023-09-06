package basic;
import java.io.*;

public class Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(" Hi " );
		sb.append("Hello World");
		System.out.println(sb);

		sb.insert(4, "has");
		System.out.println(sb);
		
		sb.delete(2,5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.lastIndexOf("Hi");
		System.out.println(sb);
	}

}
