/**
 * Look at the following code. Is there anything you can do to make this code
 * better? Hint: you may need to convert between types (e.g. casting).
 */

public class Comparator {

	public int getMax(int n, int m) {
		if(n > m) {
			return n;
			}
		else {
			return m;
		}
	}

	public double getMax(double d1, double d2) {
		if(d1 > d2) {
			return d1;
		}
		else {
			return d2;
		}
	}

	public String getMax(String number1, String number2) {
		double n1 = Double.parseDouble(number1); // Changed to Double
		double n2 = Double.parseDouble(number2); // Changed to Double
		if(n1 > n2) {
			return number1;
		}
		else {
			return number2;
		}
	}

}
