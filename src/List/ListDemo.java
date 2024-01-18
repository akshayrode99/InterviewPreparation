package List;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		
		List <String> name = new ArrayList<String>();
		
		name.add("RAj");
		name.add("Ram");
		name.add("Vijay");
		name.add("Sham");
		name.add("Rahul");
		
		
		for(int i=0 ; i<name.size();i++) {
			System.out.println(name.get(i));
		}
		
		
		
	}

}
