package Practice;

public class P9 {
	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		String str[]=s.trim().split("\\s+");
		for(String ss:str) {
			System.out.println(ss+",");
		}
		
	}
}
