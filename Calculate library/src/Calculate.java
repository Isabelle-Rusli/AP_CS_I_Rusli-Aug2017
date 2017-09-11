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
		return (operand*180)/3.14159;
	}
	public static double toRadians (double operand) {
		return (operand*3.14159)/180;
	}
	public static double discriminant (double a, double b, double c) {
		return (b*b)- 4 * a * c;
	}
	public static String toImproperFrac (int a, int b, int c) {
		int numerator = a * c + b;
		int denomenator = c;
		String improperfrac;
		improperfrac = numerator +"/"+ denomenator;
		return improperfrac;
		
	}
	public static String toMixedNum (int a, int b) {
		int wholenum = a/b;
		int numerator = a % b;
		return wholenum + "_" + numerator +"/" + b;
	}
	public static String foil (int a, int b, int c, int d, String variable) {
		return (a * c) + variable + "^2" + (a * d + b * c)+ variable + d * b;
	}
	public static boolean isDivisibleBy (int a, int b) {
		if ((a % b) == 0) { 
			return true;
		} else {
			return false; 
		}
	}
	public static double abValue (double x) {
		if (x>=0) {
			return x;
		} else {
			return -x;
		}
	}
	public static double max (double x, double y) { 
		if (x>y) {
			return x;
		} else {
			return y;
		}
	}
	public static double max (double x, double y, double z) {
		if (x>y) {
			return x;
		} else if (y>z) {
			return y;
		} else {
			return z;
		}
	}
	public static int min (int x, int y) {
		if (x>y) {
			return y;
		} else { 
			return x;
		}
	}
	public static double round2 (double x) {
		if ((x*1000) % 10 < 5) {
			return ((x*1000)-((x*1000)%10))/1000;
		} else {
			return ((10-((x*1000)%10))+(x*1000))/1000;
		}
	}
}

	
	
		
	