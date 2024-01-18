package Practice;

public class FindMaxi {

	public void find(int a , int b , int c) {


		int max;

		if(a>b) {

			max = a;
			
		}else {
			max = b;
		}

		if(max > c) {
			System.out.println(max);
			
		}else {
			System.out.println(c);
		}
	}


	public static void main(String[] args) {

		FindMaxi obj = new FindMaxi();

		obj.find(33, 22, 18);
	}
}
