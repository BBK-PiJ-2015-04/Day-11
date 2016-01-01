public class SmartPhone extends MobilePhone {
	
	public SmartPhone(String brand) {
		super(brand);
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		if(number.substring(0,2).equals("00")) {
			System.out.println(" through the internet to save money!");
		}
	}
	
	public void browseWeb(String number) {
		System.out.println("Browsing the web " + number + "...");
	}
	
	public void findPosition() {
		System.out.println("Phone is located at...");
		System.out.println("Latitude: 51 degrees North");
		System.out.println("Longitude: 1 degree West");
	}
	
}
