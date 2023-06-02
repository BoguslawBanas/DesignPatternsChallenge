public class Komórka implements Prototyp{
    private String name;

    public Komórka(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototyp clone() {
        return new Komórka(this.name);
    }
}
