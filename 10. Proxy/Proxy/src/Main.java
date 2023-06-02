public class Main {
    public static void main(String[] args) {
        SztucznaKaczka sztucznaKaczka=new SztucznaKaczka("Daniel", 15,30);
        SztucznaKaczka sztucznaKaczka1=new SztucznaKaczka("Bogus", 18,35);

        sztucznaKaczka.display();
        sztucznaKaczka1.display();

        sztucznaKaczka1.delegateFly();

        SztucznaKaczka sztucznaKaczka2=new SztucznaKaczka("Kamil", 10,25);
        sztucznaKaczka2.delegateFly();
    }
}