package Condtionals;
import java.util.Scanner;

// Claire Francis, Week4Program2, September 22, 2025

// Now your ULTIMATE COMPUTER will compute a piecewise defined function as follows:
// f(x) = 3x + 7 if x < 0
// f(x) = x^2 + 8 if 0 <= x <= 10
// f(x) = x^3 - 6x^2 if x > 10
// Write a program that asks the user for a number x.
// Then it prints the value of f(x) depending on which formula is appropriate.

public class Wk4Program2 {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		int x;
		boolean equationTwo;

		
		System.out.print("Insert a random integer (can be positive or negative): ");
		x = userinput.nextInt();
		
		equationTwo = ((x >= 0)&&(x <= 10));

		
		if(x < 0) {
			System.out.format("The value of f(x) = " + (3*x + 7));
		}
		if(equationTwo) {
			System.out.format("The value of f(x) = %.0f\n", + (Math.pow(x, 2) + 8));
		}
		if(x > 10) {
			System.out.format("The value of f(x) = %.0f\n", + (Math.pow(x, 3) - 6 * Math.pow(x, 2)));
		}
		
		

	}

}
