public class Computer {
	private State state;

	public Computer() {
		state=new ComputerOff(this);
	}

	public void button1Action() {
		state.button1Action();
		System.out.println();
	}

	public void button2Action() {
		state.button2Action();
		System.out.println();
	}
	
	public void turnOnComputer() {
		state=new ComputerOn(this);
		System.out.println("Witaj drogi użytkowniku w naszym nowym systemie.");
		System.out.println("Życzymy dobrej zabawy.");
	}
	
	public void turnOffComputer() {
		state=new ComputerOff(this);
		System.out.println("Do widzenia, drogi użytkowniku.");
	}
}
