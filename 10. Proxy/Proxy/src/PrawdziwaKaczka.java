public class PrawdziwaKaczka implements Kaczka{
    private String name;
    private int height;
    private int weight;

    public PrawdziwaKaczka(String name, int weight, int height) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        System.out.println("Mamy nowa kaczke.");
    }

    @Override
    public String toString() {
        return "PrawdziwaKaczka{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    public void fly(){
        System.out.println("Kaczka o imieniu " + name + " leci sobie.");
    }
}
