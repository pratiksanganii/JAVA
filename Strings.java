import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = firstName+" "+lastName;
        System.out.println("Your name is : "+fullName);
        // for(int i=0;i<fullName.length();i++){
        //     System.out.print(fullName.charAt(i));
        // }
        String n1 = "Pratik Sangani";
        String n2 = "Pratik Sangani";
        if(n1.compareTo(n2)==0){
            System.out.println("Strings are equal");
        }
        String sName=n1.substring(7);
        System.out.println(sName);
        // Strings are Immutable
        sc.close();
    }    
}
