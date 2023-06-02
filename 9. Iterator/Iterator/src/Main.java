public class Main {
    public static void main(String[] args) {
        MyArrayList list=new MyArrayList();
        for(int i=0;i<20;++i){
            list.pushBack(i);
        }
        for(int i=0;i<25;++i){
            list.next();
        }
    }
}