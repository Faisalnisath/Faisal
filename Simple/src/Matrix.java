
public class Matrix {

	public static void main(String[] args) {
		
		int a[][]= { {1,2,4},{2,6,7} , {4,5,8}};
		
		int b[][]= { {9,9,7},{9,5,7},{3,5,4}};
		
		int c[][] = new int [3][3];
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {

				c[i][j]=a[i][j]+ b[i][j];
				
				System.out.print(c[i][j]+ " ");
			}
		
				System.out.println();
		}

	}
}
