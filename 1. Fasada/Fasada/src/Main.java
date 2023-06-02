public class Main {
    public static void main(String[] args) {
        Hall h1=new Hall(100);
        Movie movie=new Movie("Scarface");
        Cinema cinema=new Cinema();
        cinema.startMovie(movie, h1);
        cinema.endMovie(movie, h1);
    }
}