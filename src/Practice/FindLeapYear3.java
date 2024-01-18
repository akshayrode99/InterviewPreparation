package Practice;

public class FindLeapYear3 {

	public void find(int num) {

		String l = "";
		String f = "";

		String year = String.valueOf(num);

		System.out.println(year);


		int size = year.length();
		System.out.println(size);

		for(int i = size - 2 ; i<size ; i++) {

			l = l + year.charAt(i);

		}
		System.out.println(l);

		for(int j = 0 ; j<2 ; j++) {

			f = f + year.charAt(j);

		}
		System.out.println(f);


		int lastNum = Integer.parseInt(l);
		int firstNum = Integer.parseInt(f);



		if(lastNum != 0 ) {

			if(lastNum %4== 0) {

				System.out.println("This is Leap Year");
			}
			else {
				System.out.println("This is Not Leat Year");
			}
		}
			else {


				if(firstNum %4== 0 ) {

					System.out.println("This is Leap Year");

				}else {
					System.out.println("This is Not Leap Year");
				}

			}
		}



	
	public static void main(String[] args) {
		FindLeapYear3 obj = new FindLeapYear3();

		obj.find(2000);
	}
}
