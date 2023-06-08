public class AirbusBuilder implements PlaneBuilder {
	private Airbus plane;

	public AirbusBuilder(){
		this.plane=new Airbus();
	}

	@Override
	public void startBuliding() {
		System.out.println("Zaczynam budowac samolot typu Airbus.");
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
	public Airbus finishBuliding() {
		return plane;
	}
}
