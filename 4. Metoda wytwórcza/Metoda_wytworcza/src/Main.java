public class Main {
    public static void main(String[] args) {
        WytwórcaStatkówPasażerskich w1=new WytwórcaStatkówPasażerskich();
        WytwórcaStatkówWojennych w2=new WytwórcaStatkówWojennych();

        var p1=w1.createShip("Pierwszy");
        var p2=w1.createShip("Drugi");
        var p3=w2.createShip("Pierwszy wojenny");

        p1.sayHello();
        p2.sayHello();
        p3.sayHello();
    }
}