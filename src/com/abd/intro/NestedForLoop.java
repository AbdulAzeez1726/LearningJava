package com.abd.intro;

public class NestedForLoop {
	public static void main(String args[]) {
		for (int a = 1; a <= 4; a++) {
			System.out.println("For");
			for (int b = 1; b < 3; b++)
				System.out.println("Nested For");
		}
	}
}
