package day1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class CollectionExample {

	public static void hashSetEx() {
		HashSet<String> hset = new HashSet<String>();

		hset.add("Habile");
		hset.add("software");
		hset.add("development");
		hset.add("Technologies");
		hset.add("Training");
		hset.add("development");

		System.out.println("HashSet contains: ");
		for (String result : hset) {
			System.out.println(result);
		}
	}

	public static void treeSetEx() {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("Habile");
		tset.add("software");
		tset.add("development");
		tset.add("Technologies");
		tset.add("Training");
		tset.add("development");

		System.out.println("TreeSet contains: ");
		for (String temp : tset) {
			System.out.println(temp);
		}

	}

	public static void hashMapEx() {
		// HashMap Example FindDuplicate character in a string
		String str = "habiletechE";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		int size = ch.length;

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (int i = 0; i < size; i++) {
			if (!hmap.containsKey(ch[i]))
				hmap.put(ch[i], 1);
			else {
				int val = hmap.get(ch[i]) + 1;
				hmap.put(ch[i], val);
			}
		}
		System.out.println("Duplicate Charaacters :");
		for (Map.Entry<Character, Integer> hm : hmap.entrySet()) {
			if (hm.getValue() > 1)
				System.out.println(hm.getKey() + " " + hm.getValue());
		}
	}

	public static void main(String[] args) {

		hashSetEx();
		System.out.println();
		treeSetEx();
		System.out.println();
		hashMapEx();

	}

}
