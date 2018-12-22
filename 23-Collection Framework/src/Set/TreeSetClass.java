package Set;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		
		Set<Integer> values = new TreeSet<Integer>();
		
		values.add(15);
		values.add(19);
		values.add(6);
		
		values.add(6);
		values.add(8);
		values.add(88);
		
		for(int i:values) {
			System.out.println(i);
		}
		

	}

}
