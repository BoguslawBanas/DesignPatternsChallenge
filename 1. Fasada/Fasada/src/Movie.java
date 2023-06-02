public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void start(){
        System.out.println("Rozpoczynamy seans. Dzisiaj mamy film: " + title);
    }

    public void end(){
        System.out.println("Dziekujemy za seans w naszym kinie.");
    }
}
