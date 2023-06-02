public class Hall {
    private int capacity;

    public Hall(int capacity) {
        this.capacity = capacity;
    }

    public int showCapacity(){
        return capacity;
    }

    public void openDoors(){
        System.out.println("Drzwi otwarte.");
    }

    public void closeDoors(){
        System.out.println("Drzwi zamknięte.");
    }
}
