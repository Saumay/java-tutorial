import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
		
		// Without Generics
		Collection values = new ArrayList();
		values.add(3);
		values.add("Navin");
		values.add(5.8f);

		Iterator i = values.iterator();
		while(i.hasNext())
			System.out.println(i.next());

		System.out.println();

		for(Object o : values)
			System.out.println(o);
		
		System.out.println();

		// With Generics
		Collection<Integer> values2 = new ArrayList<Integer>();
		values2.add(3);
		values2.add(5);
		values2.add(7);
		
		Iterator i2 = values2.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());
		System.out.println();
		for(Object o : values2)
			System.out.println(o);
		
		// But we can't perform many operations using collection reference like deleting or adding in between. For that, we would have to use List.
	}
}