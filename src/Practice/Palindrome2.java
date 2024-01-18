package Practice;

public class Palindrome2 {

	public void find(String s) {

		String reverse = "";

		int size = s.length();

		for(int i = size-1 ; i >= 0 ; i--) {

			reverse = reverse + s.charAt(i);
		}

		if(s.equals(reverse)) {

			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}

	}

	public static void main(String[] args) {

		Palindrome2 obj = new Palindrome2();

		obj.find("NITIN");
	}
}
