import java.util.*;

public class FunctionsMethods{

    public static void printName(String n){
        System.out.println(n);
        return;
    }

    public static int addTwoNumbers(int a,int b){
        return a+b;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = addTwoNumbers(a,b);
        System.out.println(sum);
        sc.close();
    }
}