abstract class Shape{
    String color;
    abstract double area();
    public abstract String toString();
    public Shape(String color){
        System.out.println("     Shape Constructor Call");
        this.color=color;

    }
}
class Circle extends Shape{
    float radius;
    public Circle(String color,float radius){
        super(color);
        System.out.println("Circle Constructor Call");
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "color of circle"+color+"area of circle"+area();
    }
}

class Rectangle extends Shape{

    double a,b;
    public Rectangle(String color,double a,double b){
        super(color);
        System.out.println(" Rectangle constructor call");
        this.a=a;
        this.b=b;
    }

    @Override
    double area() {
        return a*b;
    }

    @Override
    public String toString() {
        return "color of rectangle "+ color+"area of Rectangle "+area();
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        Shape s1=new Circle("red",2);
        Shape s2=new Rectangle("green",3,5);
        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }


}
