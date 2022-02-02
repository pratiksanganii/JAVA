import java.util.*;

public class Arrays{
    public static void main(String[] args) {
        // int[] arr=new int[size];
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("Given Number found at index : "+i);
            }
        }
        sc.close();
    }
}