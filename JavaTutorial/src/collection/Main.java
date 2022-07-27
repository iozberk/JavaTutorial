package collection;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// HashSet<e>
		// LinkedHashSet<e>
		// TreeSet<e>
		
		HashSet h = new HashSet();

		h.add("100");
		h.add(100);
		h.add(100.0);
		h.add(true);
		h.add(null);
		h.remove(null);
		Iterator itr = h.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
 