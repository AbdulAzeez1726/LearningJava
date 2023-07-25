package com.abd.intro;

public class Conversions {
	public static void main(String args[]) {
		//Implicit conversion
		byte a = 25;
		int b = a;
		//Explicit conversion
		int c = 129;
		byte d = (byte) c;
		float e = 55.6f;
		int g = (int) e;
		System.out.println(b);
		System.out.println(d);
		System.out.println(g);
		}
}
