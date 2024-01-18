package LogicalProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArraykistInsertion2 {

	public void a() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many integer you want in ArrayList");
		int n = sc.nextInt();

		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i =1; i <= n; i++) {
			int x = random.nextInt(100);
			list.add(x);
		}	

		System.out.println(list);
		int y = list.size();
		System.out.println(y);



	}
	

	public static void main(String[] args) {
		ArraykistInsertion2 obj = new ArraykistInsertion2();
		obj.a();
	}
}



