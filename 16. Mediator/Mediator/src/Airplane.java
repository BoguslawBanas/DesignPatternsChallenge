public class Airplane extends Aircraft {
    public Airplane(String id) {
        super(id);
    }

    @Override
    public void land() {
        System.out.println("Wyladowalem samolotem o numerze " + getId() + ".");
    }
}
