public class Cinema {
    public Cinema() {
    }
    public void startMovie(Movie movie, Hall hall){
        movie.start();
        hall.closeDoors();
    }

    public void endMovie(Movie movie, Hall hall){
        movie.end();
        hall.openDoors();
        System.out.println(hall.showCapacity());
    }
}
