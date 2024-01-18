package Practice;

public class PalindromeNumber {
	
	public void find(int n) {
		
		String reverse = "";
		String s = String.valueOf(n); 
		
		int size = s.length();  
		
		for(int i = size-1 ; i >= 0 ; i--) {
			
			reverse = reverse + s.charAt(i);
		}
		
		System.out.println(reverse);
		
		
		if(reverse.equals(s)) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
			
	}

	public static void main(String[] args) {
		
		PalindromeNumber obj = new PalindromeNumber();
		
		obj.find(121);
	}
}
