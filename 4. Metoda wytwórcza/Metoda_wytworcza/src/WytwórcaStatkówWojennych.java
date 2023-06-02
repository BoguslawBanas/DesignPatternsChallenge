public class WytwórcaStatkówWojennych extends Wytwórca{
    public WytwórcaStatkówWojennych() {
    }

    @Override
    public Statek createShip(String name) {
        return new StatekWojenny(name);
    }
}
