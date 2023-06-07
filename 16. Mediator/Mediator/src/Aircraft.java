public abstract class Aircraft{
	private final String id;

	public Aircraft(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public abstract void land();
}
