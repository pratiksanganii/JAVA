import java.util.ArrayList;
import java.util.HashSet;
public class Recursions {

    public static int printSumTillN(int n){
        if(n==1){
            return 1;
        }
        return n+printSumTillN(n-1);
    }

    public static int factorialOfN(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorialOfN(n-1);
    }

    public static void printNumber(int n){
        if(n==0)
            return;
        printNumber(n-1);
        System.out.println(n);
    }

    public static void fibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibonacci(b, c, n-1);
    }

    public static int xPowern(int x,int n){
        if(n==1){
            return x;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return xPowern(x, n/2)*xPowern(x, n/2);
        }else{
            return xPowern(x, n/2)*xPowern(x, n/2)*x;
        }
    }

    public static void towerOfHanoi(int n,String src,String hlpr,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+"From "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, hlpr);
        System.out.println("Transfer disk "+n+"From "+src+" to "+dest);
        towerOfHanoi(n-1, hlpr, src, dest);
    }

    public static void printReverseString(String S,int idx){
        if(idx==S.length()){
            return;
        }
        printReverseString(S, idx+1);
        System.out.print(S.charAt(idx));
    }

    public static int first=-1;
    public static int last=-1;
    public static void findFirstAndLastOccuranceOfGivenChar(String S,char a,int idx){
        if(idx==S.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(S.charAt(idx)==a){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        findFirstAndLastOccuranceOfGivenChar(S, a, idx+1);
    }

    public static boolean isStrictlySortedArr(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;
        }
        return isStrictlySortedArr(arr, idx+1);
    }

    public static void moveAllXToEndOfString(String s,int idx,int cnt,String ns){
        if(idx==s.length()){
            for(int i=0;i<cnt;i++){
                ns+='x';
            }
            System.out.println(ns);
            return;
        }
        if(s.charAt(idx)=='x'){
            cnt++;
            moveAllXToEndOfString(s, idx+1, cnt, ns);
        }else{
            ns+=s.charAt(idx);
            moveAllXToEndOfString(s, idx+1, cnt, ns);
        }
    }

    public static boolean map[] = new boolean[26];
    public static void removeDuplicates(String s,int idx,String ns){
        if(idx==s.length()){
            System.out.println(ns);
            return;
        }
        if(map[s.charAt(idx)-'a']){
            removeDuplicates(s, idx+1, ns);
        }else{
            map[s.charAt(idx)-'a']=true;
            ns+=s.charAt(idx);
            removeDuplicates(s, idx+1, ns);
        }
    }

    public static void printSubsequences(String s,int idx,String ns){
        // total subsequences=2^s.length()
        // geometric progression - 1 + 2^1 + 2^2 + ... + 2^n = a(r^n - 1)/(r-1) = 1(2^n - 1)/(2-1) = 2^n - 1
        // Time Complexity = O(2^n)
        if(idx==s.length()){
            System.out.println(ns);
            return;
        }
        printSubsequences(s, idx+1, ns+s.charAt(idx));
        printSubsequences(s, idx+1, ns);
    }

    public static void printUniqueSubsequences(String s,int idx,String ns,HashSet<String> set){
        if(idx==s.length()){
            if(set.contains(ns)){
                return;
            }else{
                System.out.println(ns);
                set.add(ns);
                return;
            }
        }
        printUniqueSubsequences(s, idx+1, ns+s.charAt(idx), set);
        printUniqueSubsequences(s, idx+1, ns, set);
    }

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKeypadCombinations(String s,int idx,String combs){
        // Time Complexity : O(4^n) max key number--4
        if(idx==s.length()){
            System.out.println(combs);
            return;
        }
        String mapping=keypad[s.charAt(idx)-'0'];
        for(int i=0;i<mapping.length();i++){
            printKeypadCombinations(s, idx+1, combs+mapping.charAt(i));
        }
    }

    public static void printPermutations(String s,String prmtns){
        // Time Complexity : O(n!)
        if(s.length()==0){
            System.out.println(prmtns);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            String newS = s.substring(0,i)+s.substring(i+1);
            printPermutations(newS, prmtns+c);
        }
    }

    public static int countPath(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==(n-1) && j==(m-1)){
            return 1;
        }
        return countPath(i+1,j,n,m)+countPath(i, j+1, n, m);
    }

    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int horizontal = placeTiles(n-1, m);
        int vertical = placeTiles(n-m, m);
        return horizontal+vertical;
    }

    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }
        int way1 = callGuests(n-1);
        int way2 = (n-1)*callGuests(n-2);
        return way1+way2;
    }

    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println("");
    }
    public static void printSubsets(int n,ArrayList<Integer> subset){
        // Time Complexity : O(2^n)
        if(n==0){
            printSubset(subset);
            return;
        }

        subset.add(n);
        printSubsets(n-1, subset);
        subset.remove(subset.size()-1);
        printSubsets(n-1, subset);
    }

    public static void main(String[] args) {
        // int a=0;
        // int b=1;
        // int n=7;
        // System.out.println(a);
        // System.out.println(b);
        // fibonacci(a, b, n-2);
        // System.out.println(xPowern(4, 4));
        // towerOfHanoi(3, "S", "H", "D");
        // printReverseString("pratik", 0);
        // findFirstAndLastOccuranceOfGivenChar("abaacdaefaah", 'a', 0);
        // int arr[] = {1,2,3,4,5};
        // if(isStrictlySortedArr(arr, 0)){
        //     System.out.println("Sorted");
        // }else{
        //     System.out.println("Not Sorted");
        // }
        // moveAllXToEndOfString("xerox", 0, 0, "");
        // removeDuplicates("pratiksangani", 0, "");
        // printSubsequences("pratik", 0, "");
        // HashSet<String> set = new HashSet<>();
        // printUniqueSubsequences("aaa", 0, "", set);
        // printKeypadCombinations("23", 0, "");
        // printPermutations("abc", "");
        // System.out.println(countPath(0, 0, 3, 3));
        // System.out.println(placeTiles(4,2));
        // System.out.println(callGuests(4));
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        printSubsets(n, subset);
    }
}
