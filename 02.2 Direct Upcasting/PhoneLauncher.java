/**
 * Change the script so that the SmartPhone is created with the line:
 * Mobilephone myPhone = new Smartphone();
 * Compile your code again. Are there any problems? Why do this problems
 * happen? What are the possible solutions?
 *
 * My answer:-
 * The program will now not compile, because our phone is of the type
 * MobilePhone and it tries to call the methods "browseWeb" & "findPosition",
 * which both belong to the class SmartPhone. My solution is to downcast our
 * object before calling those two methods.
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
		
	}

}
