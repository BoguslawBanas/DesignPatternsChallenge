public abstract class Plane {
    private int seats;
    private int engines;

    public Plane() {
        seats=0;
        engines=0;
    }

    public Plane(int seats, int engines) {
        this.seats = seats;
        this.engines = engines;
    }

    public int getSeats() {
        return seats;
    }

    public int getEngines() {
        return engines;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "seats=" + seats +
                ", engines=" + engines +
                '}';
    }
}
