public class Main {
    public static void main(String[] args) {
        Bankomat bankomat=new Bankomat(100);
        bankomat.wydajPieniadzeZKonta();

        System.out.println("/////////////////////////////");

        bankomat.setPieniadze_do_wydania(57);
        bankomat.wydajPieniadzeZKonta();

        System.out.println("/////////////////////////////");

        bankomat.setPieniadze_do_wydania(1);
        bankomat.wydajPieniadzeZKonta();
    }
}