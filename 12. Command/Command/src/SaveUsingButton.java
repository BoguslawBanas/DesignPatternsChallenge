import java.util.ArrayList;

public class SaveUsingButton implements SaveCommand{
    public SaveUsingButton() {
    }

    @Override
    public ArrayList<String> save(ArrayList<String>mainList, ArrayList<String>tmpList) {
        mainList.addAll(tmpList);
        tmpList.clear();
        System.out.println("Zaapisalem przy uzyciu przycisku.");
        return mainList;
    }
}
