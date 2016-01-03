public class Patient<T> {
	
	private T item;
	private Patient<T> next;
	private Patient<T> previous;
	
	public Patient(T item) {
		this.item = item;
		next = null;
		previous = null;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public void setNext(Patient<T> next) {
		this.next = next;
	}
	
	public void setPrevious(Patient<T> previous) {
		this.previous = previous;
	}
	
	public T getItem() {
		return item;
	}
	
	public Patient<T> getNext() {
		return next;
	}
	
	public Patient<T> getPrevious() {
		return previous;
	}
	
}
