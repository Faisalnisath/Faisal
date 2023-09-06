import java.io.File;
import java.io.IOException;

public class Filehandling {
	
	public static void main(String[]args) {
		
		try {
			File obj = new File("D:\\javafile\\sample.txt");

			obj.createNewFile();
			System.out.println("File created: "+ obj.getName());
		} catch (IOException e) {
			System.out.println("File not created");
			e.printStackTrace();
		}		
	
	}

}