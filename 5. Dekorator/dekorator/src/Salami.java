public class Salami extends DekoratorPizzy{
    public Salami(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void create() {
        super.create();
        System.out.println("Dodaliśmy salami.");
    }
}
