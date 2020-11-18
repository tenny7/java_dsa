package dsa;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
	static int countTinyPairs(int[] a, int[] b,int k) {
		String concatXY = "";
		int numericConcat = 0;
		int n = a.length;
//		System.out.println(n);
		int count =0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0; i<n; i++) {
			map.put(i, a[i]);
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println("key: "+entry.getKey() + " value:  "+ entry.getValue());
		}
		System.out.println("********");
		for(int j=n-1; j>0; j--) {
			if(map.get(j) == j) {
				concatXY = concatXY + map.get(j) + b[j];
				numericConcat = Integer.parseInt(concatXY);		
			}
			if(numericConcat < k) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] a = {16, 1, 4, 2,14};
		int[] b = {7, 11, 2, 0, 15};
		int k = 743;
		
		System.out.println( countTinyPairs(a,b,k) );

	}

}
