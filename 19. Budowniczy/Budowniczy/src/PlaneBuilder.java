public interface PlaneBuilder {
	public void startBuliding();
	
	public void insertEngines(int amount_of_engines);
	
	public void insertSeats(int amount_of_seats);
	
	public Plane finishBuliding();
}
