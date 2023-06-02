public class WytwórcaStatkówPasażerskich extends Wytwórca{

    public WytwórcaStatkówPasażerskich() {
    }

    @Override
    public Statek createShip(String name) {
        return new StatekPasażerski(name);
    }
}
