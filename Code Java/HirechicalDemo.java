package com.fun;
class Shape{
    int length , width;
    public Shape(int length,int width){
        this.length=length;
        this.width=width;

    }
    void display_shape(){
        System.out.println(" length :"+length+ "\n width:"+width);
    }
    void arearec(){
        System.out.println("Area of Rectangle: "+length*width);
    }

}
class Square extends Shape{
    double radius;
    String radius_color;
    public Square(int length,int width,double radius,String radius_color){
        super(length, width);
        this.radius=radius;
        this.radius_color=radius_color;
    }

    void areacir(){
        System.out.println("Area of circle : "+Math.PI*Math.pow(radius,2));
        System.out.println("Circles color : "+radius_color);

    }
}

public class HirechicalDemo {
    public static void main(String[] args) {
      Square s1=new Square(25,12,23,"Red") ;
      s1.display_shape();
      s1.arearec();
      s1.areacir();

    }


}
