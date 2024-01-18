package LogicalProgram;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InsertionArrayList {

	public void sort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many integer you want in ArrayList");
		int n = sc.nextInt();

		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i =1; i <= n; i++) {
			int x = random.nextInt(500000);
			list.add(x);
		}	

		System.out.println(list);

		int y = list.size();

		int size = list.size();
		int min =list.get(0);
		
		System.out.println("Sort Start Time : " + LocalDateTime.now());


		for(int m = 0 ; m<size ; m++) {

			min = list.get(m);
			System.out.println("m = " + m + " value = " + min);

			for(int o = m+1 ; o<size ; o++) {

				if(min>list.get(o)) {
					 
					int	temp = list.get(m);
					list.set(m, list.get(o));
					list.set(o, temp);

					min = list.get(m);
				}				
			}
		}
		System.out.println("\nsort End  Time : " + LocalDateTime.now());


		for(int q = 0 ; q < size ; q++) {
			System.out.print(list.get(q)+", ");
		}		
	}

	public static void main(String[] args) {
		InsertionArrayList obj = new InsertionArrayList();
		obj.sort();
	}
}
