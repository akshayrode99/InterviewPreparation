package List;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("Rahul", 101);
		map.put("SHam", 102);
		map.put("Sanket", 103);
		map.put("Rushi", 104);
		map.put("Suraj", 105);
		
		for(Map.Entry<String, Integer> ab: map.entrySet()) {
			
			System.out.println(ab.getKey()+" "+ab.getValue());
		}

	}

}
