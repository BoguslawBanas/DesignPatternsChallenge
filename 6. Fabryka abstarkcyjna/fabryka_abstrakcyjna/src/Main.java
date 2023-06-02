public class Main {
    public static void main(String[] args) {
        FabrykaArabiki fabrykaArabiki=new FabrykaArabiki();
        FabrykaRobusty fabrykaRobusty=new FabrykaRobusty();
        fabrykaArabiki.createMielona();
        System.out.println();
        fabrykaArabiki.createZiarnista();
        System.out.println();
        fabrykaArabiki.createRozpuszczalna();
        System.out.println();
        System.out.println();
        fabrykaRobusty.createMielona();
        System.out.println();
        fabrykaRobusty.createZiarnista();
        System.out.println();
        fabrykaRobusty.createRozpuszczalna();
    }
}