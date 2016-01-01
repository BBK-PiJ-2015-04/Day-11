/**
 * Create a script that builds a new SmartPhone with the line:
 * Smartphone myPhone = new Smartphone();
 * and then uses all its methods.
 */

public class PhoneLauncher {

	public static void main(String[] args) {

		PhoneLauncher launcher = new PhoneLauncher();
		
		launcher.launch();
		
	}

	public void launch() {
		
		SmartPhone iPhone = new SmartPhone("Apple");
		
		iPhone.call("245-1111");
		iPhone.call("223-1134");
		iPhone.call("005-1234");
		iPhone.call("345-4431");
		iPhone.call("451-3221");
		iPhone.call("999");
		
		iPhone.ringAlarm("Alarm");
		
		iPhone.playGame("Game!");
		
		iPhone.printLastNumbers();
		
		iPhone.browseWeb("Web time!");
		
		iPhone.findPosition();
		
		System.out.println(iPhone.getBrand());
		
	}

}
