import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMapOnValue {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Ram",500);
		map.put("Rahim", 1000);
		map.put("Ridhima", 800);
		map.put("Ricky", 899);
		map.put("Vikash", 545);

		Map<String, Integer> sortedMap =   map.entrySet().stream().sorted((entry1,entry2)->entry1.getValue()-entry2.getValue()).
				collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue(),(e1,e2)->e2, LinkedHashMap::new));
			System.out.println(sortedMap);	
	
	}

}
