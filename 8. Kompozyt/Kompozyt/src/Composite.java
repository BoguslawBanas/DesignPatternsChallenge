import java.util.ArrayList;

public class Composite implements Figure {
    private ArrayList<Figure>arrayOfFigures;

    public Composite() {
        this.arrayOfFigures = new ArrayList<>();
    }

    public void addFigure(Figure f){
        this.arrayOfFigures.add(f);
    }

    public void removeAllFigures(){
        this.arrayOfFigures.clear();
    }

    @Override
    public void move(double x, double y) {
        this.arrayOfFigures.forEach(f -> f.move(x,y));
    }

    @Override
    public void draw() {
        this.arrayOfFigures.forEach(Figure::draw);
    }
}
