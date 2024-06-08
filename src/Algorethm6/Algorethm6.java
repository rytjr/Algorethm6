package Algorethm6;

import java.util.*;

public class Algorethm6 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		long sum = 0;
		long sum2 =0;
		
		for(int i =0; i < num-2;i++) {
			sum2 = (num-2-i)*(num-1-i)/2;
			sum = sum + sum2;
		}
		
		System.out.println(sum);
		System.out.print(3);
		
	}
}