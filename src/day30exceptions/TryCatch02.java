package day30exceptions;

public class TryCatch02 {
//	static String m;
	public static void main(String[] args) {

		String s="";
		System.out.println(s.length()); //0
		
		try {
			s+="t";
		}catch(Exception e) {
			s+="c";
		}finally {
			s+="f";
		}
		s+="a";
		
		System.out.println(s);

//	 String'e null atandigi zaman length() methodu calismaz ve NullPointerException exception alirsiniz.	
//		String n=null;
//	Asagidaki iki satirdaki kod da exception verir.	
//		System.out.println(n.length());		
//		System.out.println(m.length());
		
	}

}
