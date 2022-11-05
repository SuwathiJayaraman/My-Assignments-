package week1.day2;

public class PrimeNumber1 {
	public static void main(String[] args) {
		int a = 13;
		boolean b= false;
		for (int i = 2; i <= a/2; i++) {
			if (a % i == 1) {
				b = true;
				break;	
			}	
		}
		if (b == true) {
			System.out.println(a + " is a prime number");
			
		} else {
System.out.println(a + " is not a prime number");
		}
	}

}
