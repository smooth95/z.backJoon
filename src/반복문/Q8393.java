package 반복문;

import java.util.Scanner;

public class Q8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = sc.nextInt();
		for (int i = 0; i <= count; i ++) {
			sum +=i;
		}
		System.out.println(sum);
	}
}
