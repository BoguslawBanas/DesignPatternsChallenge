public class SingetonClass {
    private String data;
    private static SingetonClass instance=null;

    private SingetonClass(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SingetonClass{" +
                "data='" + data + '\'' +
                '}';
    }

    public static SingetonClass getInstance(String data){
        if(instance==null){
            System.out.println("Stworzyłeś nowy obiekt.");
            SingetonClass s1=new SingetonClass(data);
            instance=s1;
            return s1;
        }
        else{
            System.out.println("Obiekt już istnieje. Oto on.");
            System.out.println(instance.toString());
            return instance;
        }
    }
}
