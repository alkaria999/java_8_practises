package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,4,6,7,9,100,34,99,2,24,24);
		
		
		//1. sum
		
		Integer sum = list.stream().reduce((a,b)->a+b).get();
		System.out.println(sum);
		//2. average
		Double ava = list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(ava);
		//3. square
		list.stream().map(e->e*e).filter(e->e<100).collect(Collectors.toList()).forEach(System.out::println);;
		//4. even
		
		List<Integer> collect = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(collect);
		//5. numbers with prefix 2
		
		List<Integer> collect2 = list.stream().map(String::valueOf).filter(e-> e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(collect2);
		//6. duplicate
		List<Integer> collect3 = list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toList());
		System.out.println(collect3);
		//7. find max and min
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		
		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		//8. sort
		System.out.println(list.stream().sorted().distinct().collect(Collectors.toList()));
		//9. sum of first 5
		Integer integer = list.stream().limit(2).reduce((a,b)->a+b).get();
		System.out.println(integer);
		//10. 2nd highest
		Integer integer2 = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer2);
		
	}
	
}

