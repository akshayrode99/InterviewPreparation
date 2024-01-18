package EqualsMethod;

public class Find {
	public static void main(String[] args) {

		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1.equals(obj2));  


		Object obj3 = obj1;
		System.out.println(obj1.equals(obj3));  

	}
}



