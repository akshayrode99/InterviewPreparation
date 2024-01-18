package JavaInterface;

class MathematicalEx implements Math {
	
	@Override
	public void add( int a , int b) {

		int c = a+b;

		System.out.println(c);

	}
   
 	@Override
	public void multi(int x , int n) {

		int m = x*n;

		System.out.println(m);
	}
 	
 	public void subs(int f , int g) {
 		
 		int h = f - g;
 		
 		System.out.println(h);
 	}  

	public static void main(String[] args) {
		MathematicalEx obj = new MathematicalEx();


		obj.add(10,20);

		obj.multi(10,5);
		
		obj.subs(60, 20);
	}

}
