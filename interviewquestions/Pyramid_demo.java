package com.interviewquestions;

public class Pyramid_demo {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i+1;j++) {
				System.out.print(" ");}
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		

	}

}
