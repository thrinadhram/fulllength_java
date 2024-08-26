package Stringbuffer_stringbuilder;

import java.util.Scanner;

public class Sbf_rev_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		
		StringBuffer sbf=new StringBuffer(String.valueOf(num));
		StringBuffer sb1=sbf.reverse();
		System.out.println(sb1);
		
		

	}

}
