/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		/*Receives an amount of money and prints it with
		the highest amount of quarters along with the remainder*/
		int amount = Integer.parseInt(args[0]);
		System.out.println("Use " + amount / 25 + " quarters and " + amount % 25 + " cents");
	}
}