public class Main {
    public static void main(String[] args) {
        Netflix netflix=new Netflix();
        Subscribent s1=new Subscribent("Bogus");
        netflix.addSubscribent(s1);
        Subscribent s2=new Subscribent("Kamil");
        netflix.addSubscribent(s2);
        Subscribent s3=new Subscribent("Olga");
        netflix.addSubscribent(s3);
        Subscribent s4=new Subscribent("Sebastian");
        netflix.addSubscribent(s4);

        netflix.notifySubscribents("Harry Potter");
        netflix.removeSubscribent(s3);
        netflix.removeSubscribent(s1);
        netflix.notifySubscribents("Rambo");
    }
}