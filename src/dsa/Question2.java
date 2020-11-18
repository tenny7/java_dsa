package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Question2 {
	static long concatenationsSum(int[] a) {
		String concat = "";
		long concatenationInt = 0;
		int ind =0;
		int n= a.length;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Map<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		
		
		for(int i=0; i<n; i++) {
			if(!map.containsKey(list.get(i))) {
				map.put(list.get(i), new ArrayList<Integer>() );
//				list.add(i);
				System.out.print("hi");
				System.out.print(list.size());
			}
		}
		for(int i=0; i<n; i++) {
				map.get(list.get(i)).add(list.get(i));
				concat = concat + a[i] + list.get(i);
				System.out.print(list.size());
				concatenationInt = Integer.parseInt(concat);				
		}
//		map.forEach((k,v)->System.out.println(v) );
		
		
		
	
		return concatenationInt;
	}

	public static void main(String[] args) {
		
		int[] a = {10,2};
		System.out.println(concatenationsSum(a) );
		
	}

}
