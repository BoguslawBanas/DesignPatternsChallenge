public class ComputerOn implements State {
	private Computer computer;

	public ComputerOn(Computer computer) {
		this.computer = computer;
	}

	public void button1Action() {
		computer.turnOffComputer();
	}
	
	public void button2Action() {
		System.out.println("Rozjaśnij ekran.");
	}
}
