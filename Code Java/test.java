public class test {
    int x =20;
    test(){
        int x=40;

    }

    public static void main(String[] args) {
        int x=60;
         test t  = new test();
        System.out.println(t.x);

    }
}
