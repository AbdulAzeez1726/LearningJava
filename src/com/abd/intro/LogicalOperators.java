package com.abd.intro;

public class LogicalOperators {
	public static void main(String args[]) {
		int a = 2;
		int b = 1;
		int c = 1;
		int d = 7;
		boolean e = a > b && c < d;
		boolean g = a < b && c < b;
		boolean h = a > b || c > d;
		boolean j = a < 1 || c > d;
		boolean k = a > b;
		System.out.println(e);
		System.out.println(g);
		System.out.println(h);
		System.out.println(j);
		System.out.println(!k);
	}
}
