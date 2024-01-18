package Practice;

public class FindLeapYear2 {

	public void find(int year) {

		String p = "";
		String q = "";

		String a = String.valueOf(year);

		System.out.println(a);

		int size = a.length();

		for(int i = size-2 ; i<size ; i++) {

			p = p + a.charAt(i);
		}
		for(int j = 0 ; j <= size-3 ; j++) {

			q = q + a.charAt(j);
		}

		int l = Integer.parseInt(p);
		int f = Integer.parseInt(q);

		if(l != 0 && l%4 == 0) {

			System.out.println("Leap Year");
		}
		else {
			if(l == 0 && f%4 == 0) {
				System.out.println("Leap year");
			}
			else {
				System.out.println("Not Leap Year");
			}
		}
	}

	public static void main(String[] args) {

		FindLeapYear2 obj = new FindLeapYear2();

		obj.find(1983);
	}	
}
