package Strings;

public class InverseString {
	public static void main(String[] args) {

		String s="PeterPARker";
		//o/p : pETERparKER

		char ch[]=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='a' && ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			
			} else {
				ch[i]=(char)(ch[i]+32);
			}
		}
//		System.out.println(ch);
		s=new String(ch);
		System.out.println(s);
	}
}
