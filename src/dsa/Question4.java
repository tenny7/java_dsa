package dsa;

public class Question4 {

	static int[] mutateTheArray(int[] a,int n) {
		int[] b = new int[n];
		
		for(int i=0; i<a.length; i++) {
//			()
			b[i] = a[i - 1] + a[i] + a[i + 1];
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {};
		int n=3;
		
		System.out.println(mutateTheArray(a,n));

	}

}
