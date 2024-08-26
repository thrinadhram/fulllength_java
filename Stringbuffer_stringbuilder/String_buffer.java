package Stringbuffer_stringbuilder;

public class String_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sbf=new StringBuffer("hello");
		sbf.append("hyd");//last
		System.out.println(sbf);
		sbf.insert(5, "abc");//exact value added
		System.out.println(sbf);
		sbf.delete(5, 8);
		System.out.println(sbf);
		sbf.deleteCharAt(4);
		System.out.println(sbf);
		sbf.reverse();
		System.out.println(sbf);
		
		
		
		

	}

}
