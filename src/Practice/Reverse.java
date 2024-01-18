package Practice;

public class Reverse {
	public static void main(String[] args) {
		
		String a = "Akshay" ;
		
		int size = a.length();
		
		
		for(int i = size-1 ; i >= 0 ; i--) {
			
			char p = a.charAt(i);
			
			System.out.print(p);
			
			
		}
	}

}
