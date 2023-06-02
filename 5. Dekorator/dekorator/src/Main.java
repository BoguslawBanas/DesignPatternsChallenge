public class Main {
    public static void main(String[] args) {
        IPizza pizza1=new KwadratowaPizza();
        IPizza pizza2=new Salami(new KwadratowaPizza());
        IPizza pizza3=new Papryka(new OkraglaPizza());
        IPizza pizza4=new Salami(pizza3);

        pizza1.create();
        System.out.println();
        pizza2.create();
        System.out.println();
        pizza3.create();
        System.out.println();
        pizza4.create();
    }
}