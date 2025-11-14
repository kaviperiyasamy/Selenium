package week1.day2;

import java.util.Scanner;

public class FibbonacciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		int firstElement = 0;
		int secondElement = 1;
		System.out.print(firstElement + " " + secondElement);
		for (int i = 3; i <= input; i++) {
			int nextElement = firstElement + secondElement;
			System.out.print(" " + nextElement);
			firstElement = secondElement;
			secondElement = nextElement;
		}
	}
}
