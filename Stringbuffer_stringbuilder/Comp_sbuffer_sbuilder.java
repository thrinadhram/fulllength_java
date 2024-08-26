package Stringbuffer_stringbuilder;

public class Comp_sbuffer_sbuilder {

	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		StringBuffer sbf = new StringBuffer("Hello");
		for (int i = 100000; i <= 5; i++) {
			sbf.append("world");
		}
		System.out.println("time taken by Stringbuffer:" + (System.currentTimeMillis() - starttime));
		starttime=System.currentTimeMillis();
		StringBuilder sbd=new StringBuilder("hello");
		for(int k=0; k<=100000; k++) {
			sbd.append("world");
			System.out.println("time taken by Stringbuffer:" + (System.currentTimeMillis() - starttime));
			
		}
		
	}
}

