import java.util.*;
import java.text.DecimalFormat;
public class Testdemo {
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int str = sc.nextInt();

        //Round Off
        double result=78.545;

        String s1= String.format("%.4f",result);
     //   System.out.println("Round Off:"+s1);

      //  System.out.format("Round off %.2",result);

        DecimalFormat df =new DecimalFormat("#.##");
      //  System.out.println("Using DecimalFormate Class:"+df.format(result));

        //Conversion

        //Automatic

        int x=10;
        double y;
        y=x;
        System.out.println(y);

        //Manual Casting

        double z=56.78;
        int a = (int)z;
//        System.out.println(z);
//        System.out.println(a);

        double c=(double) 9/2;
   //     System.out.println(c);
        double b1=9.0/2;
     //   System.out.println(b1);


     // String Manipulation





        }




        }


