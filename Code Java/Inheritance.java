 class Car {
     int Model;
     String name;
     String color;


     void displays() {
         System.out.println("Car model no :" + Model);
         System.out.println("Car Name :  " + name);
         System.out.println("Car Color :  " + color);
     }
 }

class Bike extends Car{
    int ModelB;
    String nameB;
    String colorB;


    void show(){
        System.out.println("Bike model no : "+ModelB);
        System.out.println("Bike name : "+nameB);
        System.out.println("Bike Color : "+colorB);
    }

 }
 class Train extends Bike{
     int ModelT;
     String nameT;
     String colorT;
     public Train(int Model,String name,String color,int ModelB,String nameB,String colorB,int ModelT,String nameT,String colorT){
         this.ModelB=ModelB;
         this.nameB=nameB;
         this.colorB=colorB;
         this.Model=Model;
         this.name=name;
         this.color=color;
         this.ModelT=ModelT;
         this.nameT=nameT;
         this.colorT=colorT;
     }

     void display(){
         System.out.println("train model no :"+ModelT);
         System.out.println("train Name :  "+nameT);
         System.out.println("train Color :  "+colorT);
     }

 }
public class Inheritance {
    public static void main(String[] args) {
        Train b1=new Train(98,"BMW","red",78,"hero","blue",23,"Uhayan express","sky blue");
        b1.displays();
        b1.show();
        b1.display();


    }
}



