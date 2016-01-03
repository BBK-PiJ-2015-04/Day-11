public class SortedList<T> extends PatientList<T> {
	
	@Override
	public void add(T item) {
		if(firstPatient == null) {
			firstPatient = new Patient<T>(item);
			lastPatient = firstPatient;
			index++;
		}
		else {
			if(firstPatient.getNext() == null) {
				Patient<T> temp = new Patient<T>(item);
				firstPatient.setNext(temp);
				lastPatient = temp;
				lastPatient.setPrevious(firstPatient);
				index++;
			}
			else {
				Patient<T> temp = new Patient<T>(item);
				lastPatient.setNext(temp);
				temp.setPrevious(lastPatient);
				lastPatient = temp;
				index++;	
			}
		}
	}

}
