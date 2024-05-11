package demo.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo_002 {
	
	public void findRepetitiveWordFromString(String s) {
		
		String strArray[] = s.split(" ");
		
		Map<String , Integer> map = new HashMap<String, Integer>();
		
		for(String key : strArray) {
			
			key = key.trim();
			
			if(map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, value+1);
			}else {
				map.put(key, 1);
			}
			
		}
		
		System.out.println(map);
		
		System.out.println("printing number of occurence of word in string using hashmap");
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key +" : "+map.get(key));
		}
		
		System.out.println("Printing repetititve word present in string using hashmap");
		Iterator<String> repetitiveWordIterator = map.keySet().iterator();
		while(repetitiveWordIterator.hasNext()) {
			String key = repetitiveWordIterator.next();
			if(map.get(key)>1) {
				System.out.println(key +" : "+map.get(key));
			}
		}
		
		
		/*
		 * Iterator<String> keys = map.keySet().iterator(); while(keys.hasNext()) {
		 * System.out.println(keys.next() +" : "+map.get(keys.next()));
		 * 
		 * }
		 */	
	}
	
	public void printOccorenceOfCharacter(String s) {
		char charArr[] = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char key : charArr) {
			if(map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, value+1);
			}else {
				map.put(key, 1);
			}
		}
		
		Iterator<Character> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			char c = iterator.next();
			System.out.println(c +" : "+map.get(c));
		}
		
	}
	
	public static void main(String s[]) {
		//new Demo_002().findRepetitiveWordFromString("ABC PUJA ABC HED SP ABC PUJA ANNU ANNU PUJA");
		new Demo_002().printOccorenceOfCharacter("udyihpppphaaa");
	}
}
