package Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		hset.add(50);
		System.out.println(hset);

		hset.remove(10);
		System.out.println(hset);
		//	hset.add(10);
		//System.out.println(hset);

		// print all the values
		// Iterator method

		//		Iterator itr = hset.iterator();
		//		while (itr.hasNext()) {
		//			System.out.println(itr.next());
		//		}

		//OR foreach loop

		//		for (Integer intdemo : hset) {
		//			System.out.println(intdemo);
		//		}

		//OR

		//NOTE: this method wont work because you cant iterate hashSet by index
		//		for(int i=0; i<hset.size(); i++) {
		//			System.out.println(hset.getClass(i));
		//		}

	}

}
