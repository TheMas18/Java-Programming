package DSA_Recursion;

//Leetcode Q17 Example 

public class PhonePad_LC_17 {
	public static void main(String[] args) {
		pad("","12");
	}

	private static void pad(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		int digit=up.charAt(0)-'0';
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char c=(char)('a'+i);
			pad(p+c,up.substring(1));
		}
	}
}
