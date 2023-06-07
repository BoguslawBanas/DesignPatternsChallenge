import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>exs=new ArrayList<>();
        exs.add("3 + 4");
        exs.add("1 - 2");
        exs.add("8 + 7");
        exs.add("2 - 11");

        exs.forEach(e -> System.out.println(new AtomicExpression(e).convert()));
    }
}