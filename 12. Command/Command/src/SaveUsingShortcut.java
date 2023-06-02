import java.util.ArrayList;

public class SaveUsingShortcut implements SaveCommand{

    public SaveUsingShortcut() {
    }
    @Override
    public ArrayList<String> save(ArrayList<String>mainList, ArrayList<String>tmpList) {
        mainList.addAll(tmpList);
        tmpList.clear();
        System.out.println("Zaapisalem przy uzyciu skrotu.");
        return mainList;
    }
}
