package Condition;

import java.util.Scanner;

public class Q2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		
		if (num1 == num2 && num2 == num3) {
			System.out.println(10000+num1*1000);
		} else if (num1 == num2 && num1 != num3) {
			System.out.println(1000+num1*100);
		} else if (num2 == num3 && num2 != num1) {
			System.out.println(1000+num2*100);
		} else if (num1 == num3 && num1 != num2) {
			System.out.println(1000+num1*100);
		} else if (num1 != num2 && num1 != num3) {
			if (num1 > num2 && num1 > num3) {
				System.out.println(num1*100);
			} else if (num2 > num1 && num2 > num3) {
				System.out.println(num2*100);
			} else {
				System.out.println(num3*100);
			}
		}		
	}
}
