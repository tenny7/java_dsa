package dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question2redo {

	static long concatenationsSum(int[] a) {
		String concat = "";
		int n= a.length;
		long sum = 0;
		int ind =0;
		
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0; i<n; i++) {
//			String s1 = Integer.toString(a[i]);	
			map.put(i, a[i] );
		}
		map.forEach((k,v) -> System.out.println(k + " "+ v));
		for(int j=0; j<n; j++) {
			if(map.containsKey(j)) {
				String con = "";
				concat = concat + map.get(a[j]) + a[j];
				con = con + map.get(j+1) + a[j];
				
				
				sum += Integer.parseInt(concat+con);
			}
//			int firstInt = map.get(j);
//			System.out.println(firstInt);
//			String s1 = map.get(j+1);
//			System.out.println(map.get(j+1));
//			String s2 	= Integer.toString(a[j]);
//			String s3 	= s1+s2;
//			System.out.println(s3);
//			int num 	= Integer.parseInt(s3);
//			sum = sum+num;
		}
		
		System.out.println();
		return sum;
	}

	public static void main(String[] args) {
		int[] a = {10,2};
		System.out.println(concatenationsSum(a) );	
	}

}
