package Java8.ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {
	public static void main(String[] args) {
			Consumer<String> consumer=s->System.out.println(s);
			Consumer<List<Integer>> listConsumer1=li->{
				for(Integer i:li) {
					System.out.println(i+ 100);
				}
			};
			
//			listConsumer1.accept(Arrays.asList(1,2,3,4));
			
			Consumer<List<Integer>> listConsumer2=li->{
				for(Integer i:li) {
					System.out.println(i);
				}
			};
			
			listConsumer2.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4));
			 
	}
}
