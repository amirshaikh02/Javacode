//By using Implementing Runnable interface

class implementThread1 implements Runnable{
    public void  run(){
        int i=0;
        while (i<150){
            System.out.println("Implement Thread Runnable 1..");
            i++;
        }
    }

}
class  implementThread2 implements  Runnable{
    public void run(){
        for (int i=0; i<150;i++){
            System.out.println("Implement Thread 2..");
        }
    }
}
public class ThreadRunnble {
    public static void main(String[] args) {
        implementThread1 bullet1 =new implementThread1();
        Thread gun = new Thread(bullet1);

        implementThread2 bullet2 = new implementThread2();
        Thread gun2 = new Thread(bullet2);

        gun.start();
        gun2.start();

    }
}
