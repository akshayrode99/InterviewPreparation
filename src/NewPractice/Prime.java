package NewPractice;

public class Prime {
	public void find(int n) {
		int i , j ;

		for(i = 1 ; i<=n ; i++) {

			for(j = 2 ; j<n ; j++) {

				if(i%j==0) {
					break;
				}
			}

			if(i==j) {
				System.out.print(" ,"+i);
			}
		}
	}

	public static void main(String[] args) {
		Prime obj = new Prime();

		obj.find(100);
	}
}
