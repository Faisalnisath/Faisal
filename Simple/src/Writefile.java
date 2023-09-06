import java.io.FileWriter;
import java.io.IOException;
public class Writefile {

	public static void main(String[] args) {
		try {
			FileWriter obj = new FileWriter("D:\\javafile\\sample.txt");

			obj.write("Java Program");
			obj.close();
			System.out.println("File Writed");
			
		    } 
		
		catch (IOException e) {
			System.out.println("File not Writed");
			e.printStackTrace();
			}		
	
		

	}

}
