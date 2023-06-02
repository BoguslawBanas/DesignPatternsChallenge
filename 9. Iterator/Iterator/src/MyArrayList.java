public class MyArrayList implements Iterator{

    private int size;
    private int capacity;
    private int ptr;
    private int[] array;

    public MyArrayList() {
        this.array=new int[16];
        this.capacity=16;
        this.size=0;
        this.ptr=0;
    }

    public void pushBack(int el){
        if(capacity==size){
            var array2=new int[2*capacity];
            for(int i=0;i<capacity;++i){
                array2[i]=array[i];
            }
            capacity*=2;
            array=array2;
        }
        array[size]=el;
        ++size;
    }

    @Override
    public int next() {
        if(!this.hasNext()){
            System.out.println("Nie moge pojsc dalej");
            return -1;
        }
        System.out.println("Jestem na komorce: " + this.ptr);
        ++this.ptr;
        return array[ptr-1];
    }

    @Override
    public boolean hasNext() {
        return ptr!=this.size;
    }
}
