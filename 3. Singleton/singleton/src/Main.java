public class Main {
    public static void main(String[] args) {
        SingetonClass g1 = null;
        SingetonClass g2 = null;
        SingetonClass g3 = null;
        g1.getInstance("data1");
        g2.getInstance("data2");
        g3.getInstance("data3");
    }
}