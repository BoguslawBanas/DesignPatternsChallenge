public class Switch {
	private Device device;

	public Switch(Device device) {
		this.device = device;
	}

	public void on() {
		device.on();
	}
	
	public void off() {
		device.off();
	}
}
