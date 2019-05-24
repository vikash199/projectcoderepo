package com.reverse.string;

public class ReverseString {
	public void getString(String str) {
	String reverse ="";
		int length = str.length();
		for(int i=length-1;i>=0; i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.println(reverse);
  }
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.getString("vikash");
	}
}
