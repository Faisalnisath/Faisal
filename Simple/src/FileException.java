import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class FileException {

	public static void main(String[] args) {
		
		try {
			File obj = new File("D:\\javafile\\sample.txt");
			Scanner input = new Scanner(obj);
			while(input.hasNextLine()) {
				String data= input.nextLine();
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not Writed");
			e.printStackTrace();
		}		
	
		

	}

}
