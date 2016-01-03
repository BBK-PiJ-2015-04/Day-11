/**
 *
 * Create a generic stack (with methods for pushing, poping, and checking
 * emptiness) that only works with classes that extend Number (e.g. Integer and
 * Double, but not String).
 *
 */

public class Company {
	
	public static void main(String[] args) {
		
		Company dummy = new Company();
		dummy.launch();
		
	}
	
	private void launch() {
		
		GenericStack<Double> empNames = new GenericStack<>();
		
		empNames.push(324.0);
		empNames.push(1.0);
		empNames.push(10098.0);
		empNames.push(98.0);
		empNames.push(5.0);
		
		System.out.println((empNames.isEmpty()? "The stack is empty!" : "The stack ain't empty!"));
		
		for(int i = 0; i < empNames.size(); i++) {
			System.out.println("Name: " + empNames.pop());
			i--;
		}
	
		System.out.println((empNames.isEmpty()? "The stack is empty!" : "The stack ain't empty!"));
		
	}
	
}
