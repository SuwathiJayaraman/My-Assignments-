package week1.day2;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
int s[]= {1,2,3,4,6,7,8};
		
		Arrays.sort(s);
		
		for (int i = 0; i < s.length; i++) {
			int temp=i+1;
			
			if (s[i]!=temp) {
				System.out.println(temp);
				break;
	}
		}
	}
}
