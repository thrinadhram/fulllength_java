package com.interviewquestions;

import java.util.ArrayList;

public class Class17 {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		for(int c=1;c<=100;c++) {
			al.add(c);
		}
	System.out.println(al);
		for(int i=0;i<al.size();i++) {
		if(al.get(i)==3|| al.get(i)==6||al.get(i)==7||al.get(i)==9) {
			System.out.println(al.get(i));
		}
		
		


	}


	}
}

