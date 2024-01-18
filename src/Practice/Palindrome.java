package Practice;

public class Palindrome {
	public static void main(String[] args) {

		String s = "VIRAJ";
		int size = s.length();
		
		System.out.println(size);
		String reverse = "";

		for (int i = size - 1; i >= 0; i--) {

			reverse = reverse + s.charAt(i);
		}

		if (s.equals(reverse)) {
			                                                         // Use .equals() to compare strings
			System.out.println("String is a palindrome");
		} 
		else {
			System.out.println("String is not a palindrome");
		}
	}
}



