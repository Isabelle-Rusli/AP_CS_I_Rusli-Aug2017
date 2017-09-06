/*Isabelle Rusli
 * September 6, 2017
 * Our self written math library
 * It contains a series of methods to do basic math functions.
 */
public class Calculate {
	
	//square the input
	
	public static int square (int operand) {
		int squared = operand*operand;
		return squared;
		
	}

	public static int cube (int operand) {
		int cube = operand^3;
		return cube;
	
	}
	public static double average (double operand1, double operand2) {
		return (operand1 + operand2)/2;
	
	}
	
	public static double average (double operand1, double operand2, double operand3) {
		return (operand1 + operand2 + operand3)/3;
	}
	public static double toDegrees (double operand) {
		
	}