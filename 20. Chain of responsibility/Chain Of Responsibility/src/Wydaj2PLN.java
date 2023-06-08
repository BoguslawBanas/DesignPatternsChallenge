public class Wydaj2PLN implements WydajPieniadze {
	private int pieniadzeDoWydania;

	public Wydaj2PLN(int pieniadze_do_wydania) {
		this.pieniadzeDoWydania = pieniadze_do_wydania;
	}

	@Override
	public int wydaj() {
		if(pieniadzeDoWydania==0) return 0;
		int it=pieniadzeDoWydania/2;
		System.out.println("Wydalem " + it + " monet o wartosci 2 zl.");
		new Wydaj1PLN(pieniadzeDoWydania-(it*2)).wydaj();
		return 0;
	}
}
