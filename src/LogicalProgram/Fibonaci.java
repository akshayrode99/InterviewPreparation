 package LogicalProgram;

public class Fibonaci {

	public void show(int n) {
		//first 2 number addition then second num then second


		int n1=0 , n2 = 1 ,n3;

		System.out.print(n1+" "+n2);

		for(int i = 1 ; i<n ; i++) {

			n3 = n1+n2;

			n1=n2;
			n2=n3;
			
			System.out.print(" "+n3);
		}

		
	}
	public static void main(String[] args) {
		Fibonaci f = new Fibonaci();
		f.show(10);
	}

}
