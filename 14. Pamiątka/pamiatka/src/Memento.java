public class Memento {
    private final Fonts font;
    private final int fontSize;
    private final String text;

    public Memento(Fonts font, int fontSize, String text) {
        this.font = font;
        this.fontSize = fontSize;
        this.text = text;
    }

    public Fonts getFont() {
        return font;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getText() {
        return text;
    }
}
