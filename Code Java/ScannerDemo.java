import java.util.*;

class Stud {
    int rollno;
    String name;
    String gender;


    public Stud(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Roll No:");
        rollno = sc.nextInt();

        System.out.println("Enter The Name");
        name= sc.next();

        System.out.println("Enter The Gender");
        gender= sc.next();



    }
    void display(){
        System.out.println("roll no is"+rollno);
        System.out.println("Name is "+name);
        System.out.println("Gender is "+gender);
    }
}
public class ScannerDemo {
    public static void main(String[] args) {
        Stud s = new Stud();
        s.display();



    }
}
