public class ComputerOff implements State {
	private Computer computer;

	public ComputerOff(Computer computer) {
		this.computer = computer;
	}

	public void button1Action() {
		computer.turnOnComputer();
	}
	
	public void button2Action() {
		computer.turnOnComputer();
	}
}
