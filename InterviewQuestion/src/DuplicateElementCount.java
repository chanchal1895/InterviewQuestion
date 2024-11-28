import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementCount {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 13, 4, 21, 27, 2, 59, 59, 34, 13, 13);
	//First way
	//	Set<Integer> set = new HashSet<>(list);
//		for (int i : set) {
//			System.out.println(i + " " + Collections.frequency(list, i));
//		}
		//Second way
//		Map<Integer,Integer> resultMap = new HashMap<>();
//		
//		for(int i: list) {
//			if(resultMap.containsKey(i)) {
//				resultMap.put(i, resultMap.get(i)+1);
//			}else
//				resultMap.put(i, 1);
//		}		
//		resultMap.forEach((t, u) -> System.out.println(t+" "+u));
	//third way	
//		Map<Integer,Integer> resultMap1=list.stream().collect(Collectors.toMap(Function.identity(), v-> 1,  Integer::sum));
//		resultMap1.forEach((t, u) -> System.out.println(t+" "+u));
		Map<Object, Long> resultMap = list.stream().collect(Collectors.groupingBy(k->k,LinkedHashMap::new, Collectors.counting()));
		resultMap.forEach((t, u) -> System.out.println(t+" "+u));
		
		
		
	}

}
