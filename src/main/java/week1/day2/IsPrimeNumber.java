package week1.day2;

import java.util.Scanner;

public class IsPrimeNumber {
	public static void main(String[] args) {
		boolean isPrime = true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		if (input == 1)
			System.out.println("The given number is not Prime");
		else {
			for (int i = 2; i <= input - 1; i++) {
				if (input % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println("The given number is Prime");
			else
				System.out.println("The given number is not Prime");
		}

	}
}
