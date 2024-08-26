package Stringbuffer_stringbuilder;

public class String_Reverse1 {

	public static void main(String[] args) {
		String str="abcd";//palindrome
		String rev="";
		
		StringBuilder sb=new StringBuilder(rev);
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
		
//		for(int i=str.length()-1; i>=0; i--) {
//			rev=rev+str.charAt(i);
//			
//		}
//		System.out.println("palindrome obj is:"+rev);
//		if(str.equalsIgnoreCase(rev)) {
//			System.out.println("it is a palindrome");
//		}
//		else {
//			System.out.println("it is not palindrome");
		}
	}
	//}


