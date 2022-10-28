import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        System.out.println(linkedList);
        Iterator itr = linkedList.iterator();

        System.out.println(linkedList);

        for(Iterator i=linkedList.descendingIterator();i.hasNext();){
            System.out.println(i.next());

        }

        while (itr.hasNext()){


            System.out.println(itr.next());

        }

        

    }
}
