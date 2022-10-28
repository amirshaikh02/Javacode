import java.io.*;
class Person{
    int rollno;
    String name;
    String address;
    String mobileno;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    public  Person(){

    }
    void accept() throws IOException{
        System.out.println("Enter a RollNo:");
        rollno =    Integer.parseInt(br.readLine());
        System.out.println("Enter a Name:");
        name = br.readLine();
        System.out.println("Enter a address: ");
        address = br.readLine();
        System.out.println("Enter a mobile no: ");
        mobileno= br.readLine();
    }
    void  display(){
        System.out.println("Rollno is:"+rollno);
        System.out.println("Name is:"+name);
        System.out.println("Address is:"+address);
        System.out.println("Mobile number is:"+mobileno);
    }
}
public class BufferdReaderDemo {
    public static void main(String[] args)throws IOException {
        Person p = new Person();
        p.accept();
        p.display();

    }
}
