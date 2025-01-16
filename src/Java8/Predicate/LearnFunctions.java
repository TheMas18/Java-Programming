package Java8.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class LearnFunctions {

//	private static class Student {
//		private int id;
//		private String name;
//
//		public int getId() {
//			return id;
//		}
//
//		@Override
//		public String toString() {
//			return "Student [id=" + id + ", name=" + name + "]";
//		}
//
//		public void setId(int id) {
//			this.id = id;
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public Student(int id, String name) {
//			super();
//			this.id = id;
//			this.name = name;
//		}
//
//	}
//
//	public static void main(String[] args) {
//
//		Function<String, Integer> getLen = x -> x.length();
//		Function<String, String> getSubStr = s -> s.substring(0, 3);
//		System.out.println(getLen.apply("Mas"));
//
//		Function<List<Student>, List<Student>> studentsWithPrefixAsVip = li -> {
//			List<Student> result = new ArrayList<>();
//			for (Student s : li) {
//				if (getSubStr.apply(s.getName()).equalsIgnoreCase("Vip")) {
//					result.add(s);
//				}
//			}
//			return result;
//		};
//
//		Student s1 = new Student(1, "vipaxaa");
//		Student s2 = new Student(2, "MasOpas");
//		Student s3 = new Student(3, "Goaaa");
//		
//		List<Student> list = Arrays.asList(s1,s2,s3);
//		List<Student> filtered = studentsWithPrefixAsVip.apply(list);
//		System.out.println(filtered);
//	}

	public static void main(String[] args) {
		Function<String, String> func1 = x -> x.toUpperCase();
		Function<String, String> func2 = x -> x.substring(0, 3);

//		Function<String, String> addThenFunc = func1.andThen(func2);
//		System.out.println(addThenFunc.apply("vipul"));
		String applyandThen = func1.andThen(func2).apply("vipul");
		System.out.println(applyandThen);

		Function<Integer, Integer> func3 = x -> 2 * x;
		Function<Integer, Integer> func4 = x -> x * x * x;
		
		Integer applycompose = func3.compose(func4).apply(3);
		System.out.println(applycompose); //first func4 then  func3 
		
		//whateveryou will give it will return that only
		Function<String, String> identityFun = Function.identity();
		
		System.out.println(identityFun.apply("vipul"));
		
	}

}
