package dsa;

public class Question2solved {

	static long concatenationsSum(int[] a) {
		String concat = "";
		int n= a.length;
		long sum = 0;
		int ind =0;
		
		for(int i=0; i<n; i++) {
			String s1= Integer.toString(a[i]);
			for(int j=0; j<n; j++) {
				String s2 = Integer.toString(a[j]);
				String s3 = s1 + s2;
				sum += Integer.parseInt(s3);
			}
		
		}
		System.out.println();
		return sum;
	}

	public static void main(String[] args) {
		int[] a = {10,2};
		System.out.println(concatenationsSum(a) );	
	}

}
