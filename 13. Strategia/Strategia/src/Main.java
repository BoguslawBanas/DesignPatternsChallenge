public class Main {
    public static void main(String[] args) {
        PrzechodzeniePoGrafie przechodzeniePoGrafie=new PrzechodzeniePoGrafie();
        przechodzeniePoGrafie.ustawStrategie(Strategia.DFS);
        przechodzeniePoGrafie.getP().przejdzGraf();
        przechodzeniePoGrafie.ustawStrategie(Strategia.BFS);
        przechodzeniePoGrafie.getP().przejdzGraf();
    }
}