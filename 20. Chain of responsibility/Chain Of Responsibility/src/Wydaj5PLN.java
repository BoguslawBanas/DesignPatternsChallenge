public class Wydaj5PLN implements WydajPieniadze {
	private int pieniadzeDoWydania;

	public Wydaj5PLN(int pieniadze_do_wydania) {
		this.pieniadzeDoWydania = pieniadze_do_wydania;
	}

	@Override
	public int wydaj() {
		if(pieniadzeDoWydania==0) return 0;
		int it=pieniadzeDoWydania/5;
		System.out.println("Wydalem " + it + " monet o wartosci 5 zl.");
		new Wydaj2PLN(pieniadzeDoWydania-(it*5)).wydaj();
		return 0;
	}
}
