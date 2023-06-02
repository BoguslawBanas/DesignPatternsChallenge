import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>mainList=new ArrayList<>();
        ArrayList<String>tmpList=new ArrayList<>();
        SaveUsingButton saveUsingButton=new SaveUsingButton();
        SaveUsingShortcut saveUsingShortcut=new SaveUsingShortcut();

        tmpList.add("piwo");
        tmpList.add("wino");

        mainList=saveUsingButton.save(mainList, tmpList);

        mainList.forEach(System.out::println);
        System.out.println();

        tmpList.add("gin");

        mainList=saveUsingShortcut.save(mainList, tmpList);

        mainList.forEach(System.out::println);
    }
}