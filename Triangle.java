/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		/*Displays if a set of given sides can form a triangle by checking
		if the sum of each two sides is greater than the third.*/
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		System.out.println(a + ", " + b + ", " + c + ": " + 
		(((a + b) > c) & ((b + c) > a) & ((a + c)>b)));
	}
}
