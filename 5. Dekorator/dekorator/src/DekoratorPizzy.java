public class DekoratorPizzy implements IPizza{
    private IPizza pizza;

    public DekoratorPizzy(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void create() {
        pizza.create();
    }
}
