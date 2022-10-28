class MyThreadDemo extends Thread{
    public MyThreadDemo(String name){
        super(name);
    }
        public void run(){
            int i=40;
            System.out.println("ID");
            while(true){
                System.out.println("Thread 1 Run");
            }
        }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        MyThreadDemo mtd= new MyThreadDemo("Amir");
        mtd.start();
        System.out.println("Thread Id is "+ mtd.getId());
        //System.out.println("Thread Name is "+mtd.getName());


    }
}
