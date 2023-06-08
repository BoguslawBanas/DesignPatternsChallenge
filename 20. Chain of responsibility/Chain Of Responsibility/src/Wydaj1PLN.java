public class Wydaj1PLN implements WydajPieniadze {
	private int pieniadzeDoWydania;

	public Wydaj1PLN(int pieniadze_do_wydania) {
		this.pieniadzeDoWydania = pieniadze_do_wydania;
	}

	@Override
	public int wydaj() {
		if(pieniadzeDoWydania==0) return 0;
		System.out.println("Wydalem " + pieniadzeDoWydania + " monet o wartosci 1 zl.");
		return 0;
	}
}
