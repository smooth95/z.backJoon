package 반복문;

import java.util.Scanner;

public class Q25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int totalcount = 0;
		int sum = 0;
		int price = 0;
		int count = 0;
		
		total = sc.nextInt();
		totalcount = sc.nextInt();
		
		for (int i = 0; i < totalcount; i++) {
			price = sc.nextInt();
			count = sc.nextInt();
			sum = sum+ (price * count);
		}
		if (sum == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
