public class GarbageCollection {
    public void Finalize(){
        System.out.println("garbage collection");
    }
    public static void main(String[] args) {
        GarbageCollection g1c = new GarbageCollection();
        GarbageCollection gc2 = new GarbageCollection();

        g1c=gc2;




    }
}
