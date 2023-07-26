package com.abd.intro;

public class NestedWhileLoop {
	public static void main(String args[]) {
		int a = 1;
		while (a <= 5) {
			System.out.println("hi -" + a);
			int b = 1;
			while (b <= 3) {
				System.out.println("$");
				b++;
			}
			a++;
		}
	}
}
