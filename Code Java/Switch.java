import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1;i!=0;) {

            System.out.println("Enter case Number : ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Amir Call");
                    break;

                case 2:
                    System.out.println("Ajay Call");
                    break;
                case 3:
                    System.out.println("Rakesh Call");
                    break;
                default:
                    System.out.println("No case");
            }
            System.out.println("Exit : 0\ncontinue : 1");
            i= sc.nextInt();
        }


//        for(int a=1;a<=5;a++){
//            System.out.println("hello"+a);
////            a+=2;
////            break;
//
//        }
//        int a=1;
//        while (a<=5){
//            a++;
//            System.out.println("Ajay"+a);
//
//        }
//
////        do {
////            System.out.println("amir");
////        }
////        while (c<=13);
//


    }
}
