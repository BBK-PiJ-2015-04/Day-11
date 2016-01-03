public class PatientList<T> {
	
	protected Patient<T> firstPatient;
	protected Patient<T> lastPatient;
	protected int index;
	
	public PatientList() {
		firstPatient = null;
		lastPatient = null;
		index = -1;
	}
	
	public boolean isEmpty() {
		if(index == -1) {
			return true;
		}
		else {
			return false;
		}
	}

	public int size() {
		return index + 1;
	}

	public T get(int index) {
		if(((double) index / this.index) < 0.5) {
			Patient<T> current = firstPatient;
				for(int i = 0; i < index; i++) {
				current = current.getNext();
			}
			return current.getItem();
		}
		else {
			Patient<T> current = lastPatient;
				for(int i = 0; i < (this.index - index); i++) {
				current = current.getPrevious();
			}
			return current.getItem();
		}
	}

	public T remove(int index) {
		if(index == 0) {
			Patient<T> answer = new Patient<T>(firstPatient.getItem());
			firstPatient = firstPatient.getNext();
			if(firstPatient != null) {
				firstPatient.setPrevious(null);
			}
			this.index--;
			return answer.getItem();
		}
		if(index == this.index) {
			Patient<T> answer = new Patient<T>(lastPatient.getItem());
			lastPatient = lastPatient.getPrevious();
			lastPatient.setNext(null);
			this.index--;
			return answer.getItem();
		}
		if(((double) index / this.index) < 0.5) {
			Patient<T> current = firstPatient;
				for(int i = 0; i < (index - 1); i++) {
				current = current.getNext();
			}
			Patient<T> answer = new Patient<T>(null);
			answer = current.getNext();
			current.setNext(current.getNext().getNext());
			current.getNext().setPrevious(current);
			this.index--;
			return answer.getItem();
			}
		else {
			Patient<T> current = lastPatient;
				for(int i = 0; i < (this.index - index - 1); i++) {
				current = current.getPrevious();
			}
			Patient<T> answer = new Patient<T>(null);
			answer = current.getPrevious();
			current.setPrevious(current.getPrevious().getPrevious());
			current.getPrevious().setNext(current);
			this.index--;
			return answer.getItem();
		}
	}

	public void add(int index, T item) {
		if(index == 0) {
			Patient<T> temp = new Patient<T>(item);
			temp.setNext(firstPatient);
			firstPatient.setPrevious(temp);
			firstPatient = temp;
			this.index++;
		}
		else {
			Patient<T> current = firstPatient;
			for(int i = 0; i < (index - 1); i++) {
				current = current.getNext();
			}
			Patient<T> temp = new Patient<T>(item);
			temp.setNext(current.getNext());
			current.getNext().setPrevious(temp);
			current.setNext(temp);
			temp.setPrevious(current);
			this.index++;
		}
	}

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
