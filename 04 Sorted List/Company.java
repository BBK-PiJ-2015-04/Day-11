/**
 *
 * Extend your class from the former exercise to create a sorted list. You may
 * need to override the method that adds new elements to the list. The subclass
 * should be generic.
 *
 */

public class Company {
	
	public static void main(String[] args) {
		
		SortedList<String> empNames = new SortedList<>();
		SortedList<Integer> empNumbers = new SortedList<>();
		
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
		empNames.add("Xavier");
		empNumbers.add(349);
		empNames.add("Anthony");
		empNumbers.add(555);
		
		for(int i = 0; i < empNames.size(); i++) {
			System.out.println("Name: " + empNames.get(i) + "\tNumber: " + empNumbers.get(i));
		}
	
		System.out.println("\n" + empNames.remove(2) + " with number " + empNumbers.remove(2) + " is gone! \n");
		
		for(int i = 0; i < empNames.size(); i++) {
			System.out.println("Name: " + empNames.get(i) + "\tNumber: " + empNumbers.get(i));
		}
	
	}
	
}
