public class StatekPasażerski implements Statek{
    private String name;

    public StatekPasażerski(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Zbudowaliśmy statek pasażerski dla ciebie.");
    }
}
