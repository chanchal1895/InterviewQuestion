// Given two inputs - first an array of integer "nums" and second an integer "targets"  
//and return indices of the two numbers such that they add up to the target.
//you assume that each input will have exactly one solution and you may not use same element twice.
//Example:1
// Inpput: nums = {2,7,11,15}, target = 9
//output:{0,1}
//Ex2: Inpput: nums = {3,2,4}
//output:{1,2}
//ex 3: Inpput: nums = {3,3}
//output:{0,1}

package HashMapQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {
	
	
	public static void main(String[] args) {
		int[] arr = {3,2,4};
		int target = 6;
		 
		Map<Integer, Integer> map= new HashMap<>();
		Map<Integer, Integer> map1= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		System.out.println(map);
		for(int i=0;i<arr.length;i++) {
			int second = target-arr[i];
			if(map.containsKey(second)) {	
				if(arr[i]!=second &&  i<map.get(second))
				System.out.println(i+" " +map.get(second));
				}
			}
			
		
		
	}
	

}
