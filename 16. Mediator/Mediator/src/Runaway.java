public class Runaway {
	private final String id;

	public Runaway(String id) {
		this.id = id;
	}

	public void waitToCleanRunaway() throws InterruptedException {
		Thread.sleep(3000);
	}
}
