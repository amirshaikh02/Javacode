public class TryCatchDemo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int a = 4, b = 0, c;
        try {

            c = a / b;
            System.out.println("trycatch");
            System.out.println(c);


        }
        catch (ArithmeticException e){
            System.out.println("arithmatic exception");
        }
        try {
            System.out.println(arr[10]);

        }catch(Exception e){
            System.out.println("array index");
        }
    }
}
