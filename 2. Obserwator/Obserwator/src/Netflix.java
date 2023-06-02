import java.util.ArrayList;

public class Netflix {
    private ArrayList<ISubscribent> listOfSubscribents=new ArrayList<>();

    public Netflix() {
    }

    public void addSubscribent(ISubscribent s){
        listOfSubscribents.add(s);
    }

    public void removeSubscribent(ISubscribent s){
        listOfSubscribents.removeIf(n -> n.equals(s));
    }

    public void notifySubscribents(String title){
        for(var i : listOfSubscribents){
            i.updateSubscribents(title);
        }
    }
}
