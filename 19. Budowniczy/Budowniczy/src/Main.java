public class Main {
    public static void main(String[] args) {
        PlaneBuilder plane1=new BoeingBuilder();
        plane1.startBuliding();
        plane1.insertEngines(2);
        plane1.insertSeats(100);
        plane1.finishBuliding();

        System.out.println();
        System.out.println();

        PlaneBuilder plane2=new AirbusBuilder();
        plane2.startBuliding();
        plane2.insertEngines(4);
        plane2.insertSeats(350);
        plane2.finishBuliding();
    }
}