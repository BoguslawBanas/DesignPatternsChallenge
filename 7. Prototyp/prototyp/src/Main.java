public class Main {
    public static void main(String[] args) {
        Komórka k1=new Komórka("pierwsza");
        Komórka k2=new Komórka("druga");
        Komórka k3=(Komórka) k1.clone();
        Komórka k4=(Komórka) k2.clone();

        System.out.println("k1 name: " + k1.getName());
        System.out.println("k2 name: " + k2.getName());
        System.out.println("k3 name: " + k3.getName());
        System.out.println("k4 name: " + k4.getName());
    }
}