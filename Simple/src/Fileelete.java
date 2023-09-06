import java.io.File;
public class Fileelete {

	public static void main(String[] args) {

		File obj = new File("D:\\javafile\\sample.txt");
		
		if(obj.delete()) {
			System.out.println("File deleted: " + obj.getName());
		}
		else {
			System.out.println("File not deleted");
		}

	}

}
