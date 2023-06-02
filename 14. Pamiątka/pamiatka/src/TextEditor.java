import java.util.Stack;

public class TextEditor {
    private Fonts font;
    private int fontSize;
    private String text;
    private Stack<Memento> mementos=new Stack<>();

    public TextEditor() {
        this.font = Fonts.Arial;
        this.fontSize = 10;
        this.text = "";
    }

    public TextEditor(Fonts font, int fontSize, String text) {
        this.font = font;
        this.fontSize = fontSize;
        this.text = text;
    }

    public void setFont(Fonts font) {
        this.font = font;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void save(){
        mementos.push(new Memento(font,fontSize,text));
    }

    public void restore(){
        if(mementos.empty()){
            System.out.println("Brak zapisanych stanów.");
            return;
        }
        Memento m=mementos.peek();
        mementos.pop();
        font=m.getFont();
        fontSize=m.getFontSize();
        text=m.getText();
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "font=" + font +
                ", fontSize=" + fontSize +
                ", text='" + text + '\'' +
                '}';
    }
}
