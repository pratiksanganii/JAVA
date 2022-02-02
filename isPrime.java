import java.util.*;


public class isPrime {

    public static Boolean checkPrime(int n){
        Boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(checkPrime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
