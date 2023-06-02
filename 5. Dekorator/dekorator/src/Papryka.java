public class Papryka extends DekoratorPizzy{
    public Papryka(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void create() {
        super.create();
        System.out.println("Dodalismy papryke.");
    }
}
