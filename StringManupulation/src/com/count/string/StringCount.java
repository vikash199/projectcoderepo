package com.count.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class StringCount {

	Map<Character, Integer> countMap = new HashMap<Character, Integer>();
	
	int length =0;
	public void Count(String str) {
		
		String a = str.replaceAll(" ","");
		for(char b : a.toCharArray()) {
			if(countMap.containsKey(b)) {
				int val = countMap.get(b);
				countMap.put(b, val+1);
			}
			else {
				countMap.put(b, 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> setMap : countMap.entrySet()) {
			
			System.out.println(setMap);
		}
				}
	
	
	public static void main(String[] args) {
		StringCount count = new StringCount();
		count.Count("you are a boy");
	}
}
