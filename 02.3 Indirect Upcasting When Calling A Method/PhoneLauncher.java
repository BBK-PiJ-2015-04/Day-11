/**
 * Pass this object to a method testPhone(Phone) that has only one parameter of
 * type Phone. What methods can you call on the object inside the method?
 *
 * My answer:-
 * Since Phone is an interface with just one method "call", that will be the
 * only method that one would be able to call.
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
		
		phone.call("1-800-MY-APPLE");
		
	}
	
}
