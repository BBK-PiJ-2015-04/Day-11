/**
 * Inside the former method, downcast the object to Smartphone so that you can
 * use all the public methods of Smartphone.
 *
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
		
	}

	public void testPhone(Phone phone) {
		
		SmartPhone sphone = (SmartPhone) phone;
		sphone.call("1-800-MY-APPLE");
		sphone.printLastNumbers();
		
	}
	
}
