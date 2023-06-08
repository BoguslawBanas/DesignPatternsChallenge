public class Lamp implements Device {
	public Lamp() {
	}

	@Override
	public void on() {
		System.out.println("The lamp is turned on.");
	}

	@Override
	public void off() {
		System.out.println("The lamp is turned off.");
	}
}
