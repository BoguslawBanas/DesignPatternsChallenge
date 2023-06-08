public class Main {
    public static void main(String[] args) {
        Switch s1=new Switch(new Cooker());
        Switch s2=new Switch(new Lamp());
        Switch s3=new Switch(new TV());

        s1.on();
        s2.on();
        s3.on();

        System.out.println("//////////////////////////////");

        s1.off();
        s2.off();
        s3.off();
    }
}