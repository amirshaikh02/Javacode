public class EvenDemo {
    public static void main(String[] args) {
        int arr[]=new int[40];
        for (int i=1;i<40;i++){
            arr[i]=i;
            if (arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
