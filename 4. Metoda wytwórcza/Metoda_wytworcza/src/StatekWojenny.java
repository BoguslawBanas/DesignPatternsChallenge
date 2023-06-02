public class StatekWojenny implements Statek{
    private String name;

    public StatekWojenny(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Właśnie zbudowaliśmy statek wojenny dla ciebie.");
    }
}
