import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Java_8_Stream_API_Practices {
	public static void main(String[] args) {
		//1. Write a program using stream api to move all zero's at the end in a array list
		System.out.println(zeroShiftAtRight(Arrays.asList(3, 0, 1, 0, 5, 7, 0, 9, 0, 0)));
		
		//2. Write a program using stream api to print firts non repeated character
		System.out.println(printFirstNonRepeatedChar("abcabssjd"));
		
		//3. Write a program using stream api to count the frequency of character in a string
		System.out.println(countFreqOfChar("hyderabad"));
		
	}
	
	public static List<Integer> zeroShiftAtRight(List<Integer> listOfNumbers){
		List<Integer> result = listOfNumbers.stream().filter(n-> n!=0).collect(Collectors.toList());
		result.addAll(listOfNumbers.stream().filter(n->n==0).collect(Collectors.toList()));
		return result;
	}
	
	public static String printFirstNonRepeatedChar(String str){
		List<String> stringList = Arrays.asList(str.split(""));
		return stringList.stream().filter(n->Collections.frequency(stringList, n)<=1).findFirst().get();
	}
	
	public static Map<String,Long> countFreqOfChar(String str){
		List<String> stringList = Arrays.asList(str.split(""));
		return stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
}