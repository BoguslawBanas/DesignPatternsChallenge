public class PrzechodzeniePoGrafie {
    private PrzeszukajGraf p;
    private Strategia s;

    public PrzechodzeniePoGrafie() {
        this.p = new BFS();
        this.s = Strategia.BFS;
    }

    public PrzeszukajGraf getP() {
        return p;
    }

    public void ustawStrategie(Strategia st){
        s=st;
        if(s==Strategia.BFS){
            p=new BFS();
        }
        else{
            p=new DFS();
        }
    }
}
