public class Choper extends Aircraft {
    public Choper(String id) {
        super(id);
    }

    @Override
    public void land() {
        System.out.println("Wyladowalem helikopterem o numerze " + getId() + ".");
    }
}
