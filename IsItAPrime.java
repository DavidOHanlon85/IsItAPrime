/**
 * 
 */
package codeAcademyChallenges;

import java.util.Scanner;

/**
 * 
 */
public class IsItAPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare Variables

		int number;
		boolean isItAPrimeNumber = true;
		String goAgain = "y";
		
		// Instantiate Scanner
		
		Scanner myScan = new Scanner(System.in);
		
		// Prompt and input and do while
		
		
		do {
		System.out.println("What number would you like to check as a prime?");
		number = myScan.nextInt();
		myScan.nextLine(); //Clear buffer

		if (number < 2) {
			isItAPrimeNumber = false;
		}

		if (number == 2) {
			isItAPrimeNumber = true;
		}

		for (int i = 3; i < number; i++) {
			if (number % i == 0) {
				isItAPrimeNumber = false;
			}
		}

		if (isItAPrimeNumber) {
			System.out.println(number + " is a Prime Number.");
		} else {
			System.out.println(number + " is a Non Prime.");
		}
		
		System.out.println();
		System.out.println("Would you like to check another number? (Yes/No)");
		goAgain = myScan.nextLine();
		
		} while (goAgain.charAt(0) == 'y' || goAgain.charAt(0) == 'Y');

	}

}
