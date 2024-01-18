package Practice;

public class ReverseString {
	public static void main(String[] args) {
		
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int size = a.length();
		
		for(int i = size-1 ; i >=0 ; i--) {
			
			char x = a.charAt(i);
			
			System.out.print(x);
		}
		
	}

}
