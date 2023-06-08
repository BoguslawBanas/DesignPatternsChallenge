public class Bankomat {
	private int pieniadzeDoWydania;

	public Bankomat(int pieniadzeDoWydania) {
		this.pieniadzeDoWydania = pieniadzeDoWydania;
	}

	public void setPieniadze_do_wydania(int p) {
		this.pieniadzeDoWydania = p;
	}

	public void wydajPieniadzeZKonta() {
		new Wydaj5PLN(pieniadzeDoWydania).wydaj();
	}
}
