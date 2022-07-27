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

		System.out.println("------------******************----------------");
		LinkedHashSet days = new LinkedHashSet();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		days.add("Monday"); // Only 1 times output
		days.forEach(item -> System.out.print(item +" ")); // Output --->>> Monday Tuesday Wednesday Thursday Friday Saturday Sunday
		System.out.println();
		System.out.println("------------******************----------------");


		TreeSet tree = new TreeSet<>();
		tree.add(15);
		tree.add(3);
		tree.add(1);
		tree.add(8);

		
		// tree.add(null); // java.lang.NullPointerException Error

		try {
			tree.add(null);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		tree.forEach(item -> System.out.print(item +" ")); // Output --->>> 1 3 8 15

		System.out.println();
		System.out.println("------------******************----------------");


		// ArrayList<E>
		// LinkedList<E>
		// Vector<E>

		ArrayList country = new ArrayList();
		country.add("USA");
		country.add("Canada");
		country.add("Mexico");
		country.add("USA"); // Will displayed
		country.add(0, "Cuba"); // 0. index



		country.forEach(item -> System.out.print(item +" ")); // Output --->>> Cuba USA Canada Mexico USA

		System.out.println();
		System.out.println("------------******************----------------");


		LinkedList linked = new LinkedList();
		linked.add("a");
		linked.add("b");
		linked.add("c");
		linked.add("d");

		linked.add("a");

		linked.forEach(i -> System.out.print(i +" ")); // Output --->>> null a b 2 3 5 a null



		System.out.println();
		System.out.println("------------******************----------------");
		// Vector<E>


		Vector vec = new Vector();

		vec.add(null);
		vec.add("a");
		vec.add("b");

		vec.add(2);
		vec.add(3);
		vec.add(5);

		vec.add("a");
		vec.add(null);

		vec.forEach(v -> System.out.print(v +" ")); // Output --->>> null a b 2 3 5 a null


		System.out.println();
		System.out.println("Size: " + vec.size()); // Size: 8
		System.out.println("Capacity: " + vec.capacity()); // Capacity: 10
	} 

}
 