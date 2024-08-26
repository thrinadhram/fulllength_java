package com.interviewquestions;

public class Class15 {

	public static void main(String[] args) {
		String str = "hello india hyderabad";

		int count = 1;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}

		}
		System.out.println(count);
	}
}
