package Stringbuffer_stringbuilder;

import java.util.Scanner;

public class String_builder_revnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		StringBuilder sbd=new StringBuilder();
		sbd.append(num);
		StringBuilder sbd2=sbd.reverse();
		System.out.println("reverse of numbers"+sbd2);
		
	}

}
