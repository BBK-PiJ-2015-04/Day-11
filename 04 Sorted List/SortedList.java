public class SortedList<T extends Comparable<T>> extends PatientList<T> {
	
	@Override
	public void add(T item) {
		for(int i = 0; i < size(); i++) {
			if(item.compareTo(get(i)) < 0) {
				add(i, item);
				return;
			}
		}
		super.add(item);
	}
	
}
