import java.util.*;

public class Patterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Solid Rectangle

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        
        System.out.println("");

        // Hollow Rectangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }


        System.out.println("");

       //  Half Pyramid
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


        System.out.println("");

        // Inverted half Pyramid
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


        System.out.println("");


        // Inverted & Rotated Half Pyramid
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }


        System.out.println("");


        // Inverted Half Pyramid with Numbers
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }


        System.out.println("");


        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }


        System.out.println("");

        // Floyd's Triangle
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                k++;
                System.out.print(k+" ");
            }
            System.out.println("");
        }


        System.out.println("");


        // 0-1 Triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }



        sc.close();
    }
}
