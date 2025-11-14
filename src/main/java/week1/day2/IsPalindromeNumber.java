package week1.day2;

import java.util.Scanner;

public class IsPalindromeNumber {
	public static void main(String[] args) {
		int output = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		int n = input;
		for (int i = n; n > 0; n = n / 10) {
			int rem = n % 10;
			output = rem + (output * 10);
		}
		if (input == output)
			System.out.println("The given number is a Palindrome");
		else
			System.out.println("The given number is not a Palindrome");
	}
}
