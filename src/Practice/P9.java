package Practice;

public class P9 {



	public static void main(String[] args) {

//		String Input="Happy";
//		System.out.println(reverse(Input,""));
		for(int j=0;j<5;j++) {
			for(int i=0;i<5;i++) {
				if(i==4) break;
				System.out.println("inner "+i);
			}
			System.out.println("outer " +j) ;
		}
		
	}

	private static String reverse(String p, String str) {
		if(p.length()==1) {
			return p;
		}
		str+=p.charAt(p.length()-1)+reverse(p.substring(0,p.length()-1),str);
		return str;
	}
}