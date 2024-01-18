package Practice;

public class FindLeapYear {

	public void find(int num) {

		String p = "";
		String q = "";

		String a = String.valueOf(num);

	//	System.out.println(a);

		int size = a.length();

	//	System.out.println(size);

		for(int i = size-2 ; i<size ; i++) {

			p = p + a.charAt(i);
		}
		for(int j = 0 ; j <= size-3 ; j++) {

			q = q + a.charAt(j);
		}
		System.out.println(p);
		System.out.println(q);

		int l = Integer.parseInt(p);
		int f = Integer.parseInt(q);

		if(l != 0 ) {

			if(l%4 == 0) {

				System.out.println("Leap Year");
			}
			else {
				System.out.println("Not Leap Year");
			}
		}
		else {
			if(f%4 == 0) {
				System.out.println("Leap Year");
			}
			else {
				System.out.println("Not Leap Year");
			}
		}
	}

	public static void main(String[] args) {
		FindLeapYear obj = new FindLeapYear();

		obj.find(2000);
	}
} 
