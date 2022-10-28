import java.util.*;
public class buffer {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("hello world");
        StringBuffer sb2 = new StringBuffer("hello world");


        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));

    }
}
