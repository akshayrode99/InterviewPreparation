package Practice;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = {22 , 40 , 19 , 27 , 13};
		int size = a.length;
		int temp;

		for(int i = 0 ; i < size ; i++) {

			for(int j = 0 ; j < size-1 ; j++) {

				temp = a[j];
				if(a[j] > a[j+1]) {

					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int z = 0 ; z<size ; z++) {
			System.out.print(a[z]+",");
		}
		System.out.println();



		String s = "NITINjk";
		int n = s.length();

		String reverse = "";

		for(int i = n-1 ; i>=0 ; i--) {

			reverse = reverse +s.charAt(i);
		}

		if(s.equals(reverse)) {
			System.out.println("Is pelendrome");
		}
		else {
			System.out.println("is NOt pelendrome");
		}	
	}
}
