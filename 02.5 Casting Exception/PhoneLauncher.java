/**
 * Create a MobilePhone object and then pass it to method testPhone(Phone).
 * What happens?
 *
 * My answer:-
 * There is a runtime error "ClassCastException". This is because we are trying
 * to cast it to something it never was, a SmartPhone.
 */

public class PhoneLauncher {

	public static void main(String[] args) {

		PhoneLauncher launcher = new PhoneLauncher();
		
		launcher.launch();
		
	}

	public void launch() {
		
		MobilePhone iPhone = new SmartPhone("Apple");
		
		iPhone.call("245-1111");
		iPhone.call("223-1134");
		iPhone.call("005-1234");
		iPhone.call("345-4431");
		iPhone.call("451-3221");
		iPhone.call("999");
		
		iPhone.ringAlarm("Alarm");
		
		iPhone.playGame("Game!");
		
		iPhone.printLastNumbers();
		
		((SmartPhone)iPhone).browseWeb("Web time!");
		
		((SmartPhone)iPhone).findPosition();
		
		System.out.println(iPhone.getBrand());
		
		testPhone(iPhone);
		
		MobilePhone SamsungGalaxy = new MobilePhone("Samsung");
		testPhone(SamsungGalaxy);
		
	}

	public void testPhone(Phone phone) {
		
		SmartPhone sphone = (SmartPhone) phone;
		sphone.call("1-800-MY-APPLE");
		sphone.printLastNumbers();
		
	}
	
}
