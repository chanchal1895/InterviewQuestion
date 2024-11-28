import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LonelyInteger {
	public static void main(String[] args) {
	
		List<Integer> list = List.of(1, 2,3,4,3,2,1);
		Set<Integer> s = new HashSet<>(list);
		Map<Integer,Long> map =list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		int i = map.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().get();
		System.out.println(i);
		
		int[] a = new int[100];
		List<Integer> l = new ArrayList<Integer>();
	
	System.out.println(Collections.frequency(list,1));
	
	
	
	}

}
