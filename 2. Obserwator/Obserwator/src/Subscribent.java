public class Subscribent implements ISubscribent{
    private int id;
    private static int nextId=1;
    private String name;

    public Subscribent(String name) {
        this.id = nextId;
        this.name = name;
        ++nextId;
    }

    public int getId() {
        return id;
    }

    @Override
    public void updateSubscribents(String title) {
        System.out.println("Witaj " + name + ", właśnie dodaliśmy nowy film dla ciebie: \"" + title + "\".");
    }

    @Override
    public boolean equals(Object obj) {
        Subscribent sub=(Subscribent) obj;
        return this.getId()==sub.getId();
    }
}
