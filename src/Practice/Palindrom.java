package Practice;

public class Palindrom {

	public static void main(String[] args) {

		String s = "NITIN";
		int size = s.length();
		String reverse = "";                          //here is problem. solve problem actually space is also find in size so this problem is occurd

		for(int i = size-1 ; i >= 0 ; i--) {


			reverse = reverse + s.charAt(i);
		}

		int x = s.length();
		int y = reverse.length();

		System.out.println(x+ " ," +y);


		System.out.println(s);
		System.out.println(reverse);
		if(s.equals(reverse)) {                          //if(reverse == s) why not possible

			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}		
	}
} 


