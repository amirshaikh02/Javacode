
// By Extending Thread class

class Thread1 extends Thread
{
    public void run(){
        int i=0;
        while (i<3000){
            System.out.println("Thread 1 is Running..");
            i++;
        }
    }
    public void run(int x){
        System.out.println("..........");
    }
    public  void run(long y){
        System.out.println("lllllllllll");
    }
}
class Thread2 extends Thread1{
    @Override
    public void run() {
        int i=0;
        while (i<3000){
            System.out.println("Thread 2 is Running");
            System.out.println("Thread 2");
            i++;

        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

    }
}
