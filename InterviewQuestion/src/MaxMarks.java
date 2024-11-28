import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxMarks {
	
	public static void main(String[] args) {
		
		final List<Integer> l = new ArrayList<>();
		
		l.add(23);
		l.add(34);
		l.add(11);
		l.add(12);
		l.add(38);
		l.add(91);
		l.add(182);
		
		System.out.println(l.stream().mapToInt(v->v).max().orElseThrow(NoSuchElementException::new));
		System.out.println(l.stream().sorted().limit(1).findFirst().get());
		System.out.println(l.stream().max(Comparator.comparing(i ->i )).get());
		System.out.println(l.stream().min(Comparator.comparing(i->i)).get());
		System.out.println(l.stream().sorted((l1,l2)->(l2-l1)).limit(3).collect(Collectors.toList()));
		System.out.println(l.stream().sorted((l1,l2)->(l2-l1)).skip(3).collect(Collectors.toList()));
		
		//SecondLargest
		System.out.println(l.stream().sorted((i1,i2)->i2-i1).skip(1).limit(1).collect(Collectors.toList()).get(0));
		
	}

}	
