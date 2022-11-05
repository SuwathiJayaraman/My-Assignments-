package week1.day2;

public class Intersection {
	public static void main(String[] args) {
		int[] a= {5,2,17,11,6,3};
		int[] b= {8,2,3,4,7,9,11};
		for(int i=1;i<=a.length-1;i++) {
		for(int j=1;j<=b.length-1;j++) {
			if(b[j]==a[i])
			{
				System.out.println(a[i]);
			}
		}
			
		}
		
	}
	

}
