import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Blue");
        arrayList.add("Black");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList.get(2));

        System.out.println(arrayList);
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
