public class SztucznaKaczka implements Kaczka{
    private PrawdziwaKaczka p;
    private String name;
    private int weight;
    private int height;

    public SztucznaKaczka(String name, int weight, int height) {
        this.p=null;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void display() {
        if(p==null){
            p=new PrawdziwaKaczka(name,weight,height);
        }
        p.display();
    }

    public void delegateFly(){
        if(p==null){
            System.out.println("Brak kaczki prawdziwej kaczki == brak lotu.");
        }
        else{
            p.fly();
        }
    }
}
