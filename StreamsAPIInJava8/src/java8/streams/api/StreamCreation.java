package java8.streams.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String [] arg) {
		Collection<String> collection = Arrays.asList("a","b","c");
		
		Stream<String> streamOFCollection =  collection == null || collection.isEmpty() ? Stream.empty() : collection.stream();
		
		streamOFCollection.forEach(x -> System.out.println(x));
		
		System.out.println("Full array");
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamOfFullArray = Arrays.stream(arr);
		streamOfFullArray.forEach(x -> System.out.println(x));
		
		///a part of an array
		System.out.println("Array by part");
		Stream<String> streamOfArrayByPart = Arrays.stream(arr,0,2);
		streamOfArrayByPart.forEach(x -> System.out.println(x));
		
		Stream<String> streamBuilder =  Stream.<String>builder().add("a").add("b").add("c").build();
		
		//This will creates a sequence of ten strings with the value – “ele”.
		Stream<String> streamGenerate = Stream.generate(() -> "ele").limit(10);
		streamGenerate.forEach(x -> System.out.println(x));
		
		//stream is by using the iterate() method
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n*2).limit(5);
		streamIterated.forEach(x -> System.out.println(x));
		
	}
	
	
}
