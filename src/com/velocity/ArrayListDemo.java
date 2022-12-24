package com.velocity;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Abhi");
		arrayList.add("Morshkar");

		for (String s : arrayList) {
			System.out.println(s);

		}
	}
}
