public class GenericStack<T extends Number> {
	
	private PatientList<T> stack;
	
	public GenericStack() {
		stack = new PatientList<T>();
	}
	
	public void push (T item) {
		stack.add(item);
	}
	
	public T pop() {
		return stack.remove(stack.size() - 1);
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int size() {
		return stack.size();
	}
	
}