interface Drawable{
    public void draw();

}
public class LambdaDemo {
    public static void main(String[] args) {
        int width=10;

        Drawable d2 = ()->{
            System.out.println("drawing:"+width);
        };
        d2.draw();
    }
}
