public class Main {
    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor(Fonts.Times_New_Roman,10,"Witamy w edytorze");
        textEditor.save();
        textEditor.setText("Nowy tekst");
        textEditor.setFont(Fonts.Calimba);
        textEditor.setFontSize(30);
        textEditor.save();
        textEditor.setFont(Fonts.Arial);

        System.out.println("///////////////////");

        textEditor.restore();
        System.out.println(textEditor);

        System.out.println("///////////////////");

        textEditor.restore();
        System.out.println(textEditor);

        System.out.println("///////////////////");

        textEditor.restore();
        System.out.println(textEditor);
    }
}