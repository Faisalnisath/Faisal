package basic;

public class Simpleclass {
	
		Simpleclass(){
			System.out.println("Hi Welcome");
		}
		
		Simpleclass(int a){
			System.out.println("Int value is:" +a);
		}
		
		private void Simpleclass(String name) {
			System.out.println(name);
		}
		
		public static void main(String[] args) {
		
		//Simpleclass obj = new Simpleclass();
		Simpleclass obj3 = new Simpleclass();

		Simpleclass obj1 = new Simpleclass(15);
		
		obj3.Simpleclass("Faisal");
		

		

	}

}
