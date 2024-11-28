import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharOfArr1InArr2 {
	
	public static void main(String[] args) {
		
		List<Integer> numList1 = Stream.of(1,5,8).collect(Collectors.toList());
		List<Integer> numList2 = Stream.of(4,5,8,9).collect(Collectors.toList());
		Set<Integer> numSet1 = new HashSet<>(numList1);
		Set<Integer> commonNumSet = numList2.stream().filter(num->!numSet1.add(num)).collect(Collectors.toSet());
		System.out.println(commonNumSet);
		List<Character> charList1 = Stream.of('a','b','c','e').collect(Collectors.toList());
		List<Character> charList2 = Stream.of('a','d','e','b','c').collect(Collectors.toList());
		Set<Character> set = new HashSet<>(charList1);
		Set<Character> reapeatedChar = charList2.stream().filter(char1->!set.add(char1)).collect(Collectors.toSet());
		System.out.println(reapeatedChar);
		
		
	}

}
