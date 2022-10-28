class Lang{
    public void show(){
        System.out.println("Java Programming Lanaguage");
    }
}
class  Subject extends Lang{
    public  void show(){
        System.out.println("CPP Language");
        }
}
public class OverridingDemo {
    public static void main(String[] args) {
        Lang l =new Lang();
        l.show();

        Subject s = new Subject();
        s.show();


    }
}
