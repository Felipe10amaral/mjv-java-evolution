package collectionsmain;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set <String> set = new TreeSet<>();
		Set <String> set1 = new HashSet<>();
		
		set.add("tv");
		set.add("armario");
		set.add("notebook");
		
		set1.add("tv");
		set1.add("armario");
		set1.add("notebook");
		
		System.out.println(set.contains("notebook"));
		System.out.println(set1.contains("notebook"));
		
		for (String p: set) {
			System.out.println(p);
		}
		
		for (String p: set1) {
			System.out.println(p);
		}

	}

}
