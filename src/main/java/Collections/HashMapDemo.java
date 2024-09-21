package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// HashMap contains data as Key, Value pairs.
		// Contains only unique keys
		// Not synchronised and No order
		// Java HashMap may have one null key and multiple null values

		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("bet", "www.bet9ja.com");
		hmap.put("app", "www.apple.com");
		hmap.put("shop", "www.amazon.com");
		hmap.put("str", "www.tesco.com");
		hmap.put("sch", "www.coventry.com");
		hmap.put("fc", "www.barcelona.com");

		hmap.remove("fc");
		//hmap.replace("sch", "school");
		hmap.remove("sch", "www.coventry.com");

		//	System.out.println(hmap);

		// print all the values, foreach loop
		//Set s = hmap.keySet();

		//		for (String key : hmap.keySet()) {
		//			System.out.println("Key is : " + key + ", Value is : " + hmap.get(key) + "!");
		//		}

		// Iterator method
		Set s = hmap.keySet();
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println("Key is : " + key + ", Value is : " + hmap.get(key) + "!");
		}

	}

}
