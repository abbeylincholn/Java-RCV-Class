package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		// if you wanna store ArrayList with a specific datatype
		//ArrayList<Integer> al = new ArrayList<Integer>();
		//ArrayList<Boolean> al = new ArrayList<Boolean>();
		//ArrayList<String> al = new ArrayList<String>();

		ArrayList al = new ArrayList();

		//Add items to ArrayList
		al.add(10);
		al.add("RCV");
		al.add(true);

		//		System.out.println(al.size());
		//		System.out.println(al);

		// lets say u wanna use the element 10, which is integer primitive DT, and it currently and object, then you then need to CAST it to make the object change to integer
		int i = (Integer) al.get(0);
		String j = (String) al.get(1);

		//Remove items from ArrayList
		//		al.remove(0);
		//		System.out.println(al);
		//		System.out.println(al.size());
		//
		//		al.remove(true);
		//		System.out.println(al);

		al.add("RCV");
		al.add(true);
		al.add(10);
		al.add("RCV1");
		al.add(false);
		//System.out.println(al);

		// Fetch items from ArrayList
		//System.out.println(al.get(1));

		// to loop through the Array
		//		for (int i = 0; i < al.size(); i++) {
		//			System.out.println(al.get(i));
		//
		//		}

		//OR

		// for each loop method, more better
		//				for (Object obj : al) {
		//					System.out.println(obj);
		//				}

		// OR Iterator method
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
