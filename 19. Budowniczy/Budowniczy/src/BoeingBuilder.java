public class BoeingBuilder implements PlaneBuilder {
	private Boeing plane;

	public BoeingBuilder(){
		this.plane=new Boeing();
	}

	@Override
	public void startBuliding() {
		System.out.println("Zaczynam budowac samolot typu Boeing.");
	}

	@Override
	public void insertEngines(int amount_of_engines) {
		System.out.println("Wstawiam " + amount_of_engines + " silników.");
		plane.setEngines(amount_of_engines);
	}

	@Override
	public void insertSeats(int amount_of_seats) {
		System.out.println("Wstawiam " + amount_of_seats + " miejsc siedzacych.");
		plane.setSeats(amount_of_seats);
	}

	@Override
	public Plane finishBuliding() {
		return plane;
	}
}
