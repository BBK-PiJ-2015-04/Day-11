public class MobilePhone extends OldPhone {
	
	private String[] lastTenNumbers = new String[10];
	
	public MobilePhone(String brand) {
		super(brand);
		for(int i = 0; i < 10; i++) {
			lastTenNumbers[i] = "Empty";
		}
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		int counter = 0;
		for(int i = 0; i < 10; i++) {
			if(lastTenNumbers[i].equals("Empty")) {
				counter = i;
				break;
			}
			counter = i;
		}
		if(counter == 9 && !lastTenNumbers[9].equals("Empty")) {
			for(int i = 0; i < 9; i++) {
				lastTenNumbers[i] = lastTenNumbers[i + 1];
			}
			lastTenNumbers[9] = number;
		}
		else {
			lastTenNumbers[counter] = number;
		}
	}
	
	public void ringAlarm(String number) {
		System.out.println("Ringing alarm " + number + "...");
	}
	
	public void playGame(String number) {
		System.out.println("Playing game " + number + "...");
	}
	
	public void printLastNumbers() {
		for (int i = 0; i < 10; i++) {
			if(!lastTenNumbers[i].equals("Empty")) {
				System.out.println(lastTenNumbers[i]);
			}
		}
	}

}
