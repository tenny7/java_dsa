package dsa;

import java.util.ArrayList;

public class Question3 {
	
	static int[][] meanGroups(int[][] a){
		int n = a.length;
		int sum = 0;
		
		ArrayList<Integer> mean = new ArrayList<>();
		for(int i=0; i<n; i++) {
			
//			System.out.println("length of inner array "+a[i].length);
			for(int j=0; j<a[i].length; j++) {
//				System.out.println("elements "+a[i][j]);
				sum += a[i][j];	
			}
			
			mean.add(sum/(a[i].length));
			System.out.print(mean + " ");
			
			
		}
		
		
		
		return a;
	}

	public static void main(String[] args) {
		int[][] a = {
					 {3,3,4,2},
					 {4,4},
					 {4,0,3,3},
					 {2,3},
					 {3,3,3}
					 };
		System.out.println(meanGroups(a));
	}

}
