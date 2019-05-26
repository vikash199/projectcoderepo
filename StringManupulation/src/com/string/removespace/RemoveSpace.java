package com.string.removespace;

import java.util.Arrays;

public class RemoveSpace {

	public static void getString(String str) {

		String[] a = str.split(" ");
		for(int i = 0; i<a.length;i++) {
			System.out.print(a[i]);
		}
	}
	public static void main(String[] args) {
		RemoveSpace.getString("the name of the class");
	}
}
