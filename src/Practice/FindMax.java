package Practice;

public class FindMax {

	public static void main(String[] args) {

		int temp;

		int a[] = {10 , 16 , 9 , 27 , 13 , 83 , 66, 72 , 48 , 69 , 12 , 38,  45 , 67 };

		int size = a.length;

		for(int i = 0 ; i < size ; i++) {

			for(int j = 0 ; j < size-1 ; j++) {

				temp = a[j];

				if(a[j] > a[j+1]) {

					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			for(int z = 0 ; z < size ; z++) {

			}
		}
		System.out.print(a[size-1]);
	}
}
