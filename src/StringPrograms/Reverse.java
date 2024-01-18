package StringPrograms;

public class Reverse {
	public static void main(String[] args) {

		String  s = "Hello" ;

		int size = s.length();
		String result = " ";

		for(int i = size-1 ; i>=0 ; i-- ) {
			
			
			result = result + s.charAt(i);
		}
		System.out.println(result);

	}
}
