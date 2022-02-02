import java.util.*;


public class Excercise1{
    // 1
    public static float printAverage(float n1,float n2,float n3){
        return (n1+n2+n3)/3;
    }

    // 2
    public static int printOddNumberTillN(int n){
        int sum = 0;
        for(int i=1;i<=n;i+=2){
            sum =sum+i;
        }
        return sum;
    }

    // 3
    public static int returnMaxValue(int n1,int n2){
        if(n1>n2){
            return n1;
        }else{
            return n2;
        }
    }

    public static double circumstanceForR(int r){
        return (2*3.14*r);
    }

    public static void canVote(int age){
        if(age>18){
            System.out.println("Eligible to Vote.");
        }else{
            System.out.println("Not Eligible to Vote.");
        }
    }

    public static int xRaisedToThePowern(int x,int n){
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans = ans*x;
        }
        return ans;
    }

    public static int GreatestCommonDivisor(int n,int m){
        int j=Math.min(n,m);
        int ans =1;
        for(int i=j;i>=1;i--){
            if(m%i==0 && n%i==0){
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void printFibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.
        // float n1 = sc.nextFloat();
        // float n2 = sc.nextFloat();
        // float n3 = sc.nextFloat();
        // System.out.println(printAverage(n1,n2,n3));

        // 2.
        // int n = sc.nextInt();
        // System.out.println(printOddNumberTillN(n));

        // 3.
        // int n5=sc.nextInt();
        // int n6=sc.nextInt();
        // System.out.println(returnMaxValue(n5,n6));

        // 4.
        // int r = sc.nextInt();
        // System.out.println(circumstanceForR(r));

        // 5.
        // int age = sc.nextInt();
        // canVote(age);

        // 6.
        // int i=1;
        // do{
        //     System.out.println(i);
        // }while(i>0);

        // 7.
        // int pos=0,neg=0,zero=0;
        // System.out.println("Press any key to continue or q to exit...");
        // char c = sc.next().charAt(0);
        // while(c!='q'){
        //     System.out.print("Enter value : ");
        //     int n = sc.nextInt();
        //     if(n>0)
        //         pos++;
        //     if(n<0)
        //         neg++;
        //     if(n==0)
        //         zero++;
        //     System.out.println("Press any key to continue or q to exit...");
        //     c = sc.next().charAt(0);
        // }
        // System.out.println("Positives : " + pos);
        // System.out.println("Negatives : " + neg);
        // System.out.println("Zeroes : " + zero);
        
        // 8.
        // int x = sc.nextInt();
        // int n = sc.nextInt();
        // System.out.println(xRaisedToThePowern(x,n));

        // 9.
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // System.out.println(GreatestCommonDivisor(n1,n2));
        
        // 10.
        int f = sc.nextInt();
        printFibonacci(f);

        sc.close();
    }
}