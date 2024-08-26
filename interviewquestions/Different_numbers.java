package com.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Different_numbers {

	public static void main(String[] args) {

		ArrayList<String> a=new ArrayList<String>();
		a.addAll(Arrays.asList("a","b","1","2"));
		for(int i=0; i<=a.size(); i++) {
			if(a.get(i)=="a" || a.get(i)=="2") {
				System.out.println(a.get(i));
				
			}
			
			
		}
	}

}
