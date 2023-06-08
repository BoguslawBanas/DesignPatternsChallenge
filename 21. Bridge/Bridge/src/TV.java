public class TV implements Device {
	public TV() {
	}

	@Override
	public void on() {
		System.out.println("The TV is turned on.");
	}

	@Override
	public void off() {
		System.out.println("The TV is turned off.");
	}
}
