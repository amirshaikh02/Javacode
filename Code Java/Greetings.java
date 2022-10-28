import javax.xml.namespace.QName;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
            greetings();
            greeting2();


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name: ");
        String name = sc.next();
        String personalised = greet(name);
        System.out.println(personalised);

    }

    static String greet(String name) {
        String message = "hello "+ name;
        return  message;
    }

    static void greetings(){
        int a= 10;
        int b=20;
        int c =a + b;

        System.out.println("greetings " + c);

    }
    static  void greeting2(){
        System.out.println("hello");
    }
}
