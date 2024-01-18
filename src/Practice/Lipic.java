package Practice;

public class Lipic {
	
	public void show(int num) {
		
		if(num%4 == 0) {
			System.out.println("Year is Lipik");
		}
		else {
			System.out.println("Year is not Lipik");
		}
				
	}
	
	public static void main(String[] args) {
		Lipic obj = new Lipic();
		obj.show(1997);
	}

}
