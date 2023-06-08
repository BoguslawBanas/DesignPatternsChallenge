public class Cooker implements Device {

	public Cooker() {
	}

	@Override
	public void on() {
		System.out.println("The cooker is turned on.");
	}

	@Override
	public void off() {
		System.out.println("The cooker is turned off.");
	}
}
