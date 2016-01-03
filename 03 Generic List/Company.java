/**
 *
 * Modify the doubly-linked list that you have created in past weeks to make it
 * generic, i.e. to allow it to have values of its elements of any type. Once
 * you have it ready, create a class Company that keeps two linked lists, one
 * with the names of the employees and one with their National Insurance
 * Number.
 *
 */

public class Company {
	
	public static void main(String[] args) {
		
		PatientList<String> empNames = new PatientList<>();
		PatientList<Integer> empNumbers = new PatientList<>();
		
		empNames.add("John");
		empNumbers.add(123);
		empNames.add("Peter");
		empNumbers.add(456);
		empNames.add("Michael");
		empNumbers.add(789);
		empNames.add("Gustav");
		empNumbers.add(101);
		empNames.add("Johann");
		empNumbers.add(201);
		
		for(int i = 0; i < empNames.size(); i++) {
			System.out.println("Name: " + empNames.get(i) + "\tNumber: " + empNumbers.get(i));
		}
	
		System.out.println("\n" + empNames.remove(3) + " with number " + empNumbers.remove(3) + " is gone! \n");
		
		for(int i = 0; i < empNames.size(); i++) {
			System.out.println("Name: " + empNames.get(i) + "\tNumber: " + empNumbers.get(i));
		}
	
	}
	
}
