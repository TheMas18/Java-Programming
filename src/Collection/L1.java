package Collection;

import java.util.*;

public class L1 {
	public static void main(String[] args) {
			String arr[]= {"F","G","H"};
			System.out.println("array"+Arrays.toString(arr));
			System.out.println();
			List<String> l=Arrays.asList(arr);
			System.out.println("list"+l);
			
			
			Set<String> s=new HashSet<String>(l); 
			s.add("F");
			s.add("B");
			s.add("E");
			s.add("D");
			s.add("C");
			System.out.println("Set"+s);
			
	}

}
