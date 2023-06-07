public class Main {
    public static void main(String[] args) throws InterruptedException {
        Airport airport=new Airport(new Runaway("32L"));
        airport.addToLandingQueue(new Airplane("43rf"));
        airport.addToLandingQueue(new Airplane("9989y"));
        airport.addToLandingQueue(new Choper("65t"));
        airport.addToLandingQueue(new Choper("98lll"));
        airport.inform();
    }
}