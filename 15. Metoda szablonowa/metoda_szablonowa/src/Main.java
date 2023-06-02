public class Main {
    public static void main(String[] args) {
        Shape s1=new Circle(new Point(3.0,6.0), 4);
        Shape s2=new Circle(new Point(10,20), 10);
        Shape s3=new Square(new Point(1,1), 1);
        Shape s4=new Square(new Point(0,0),20);

        System.out.println(s1.find_circumference());
        System.out.println(s2.find_field());
        s3.change_position(new Point(100,150.6));
        System.out.println(s3.find_field());
        System.out.println(s4.find_circumference());

        System.out.println("//////////////////////////////");

        s1.show();
        s2.show();
        s3.show();
        s4.show();
    }
}