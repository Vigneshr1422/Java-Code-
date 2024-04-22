import java.util.*;
public class vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String a1 = in.nextLine();
        char op[]=a1.toCharArray();
        int count=0 ;
        for (char c : op) {
            switch (c) {
                   case 'a':
                   case 'e':
                   case 'i':
                   case 'o':
                   case 'u':
                   count++;            
                default:
                    break;
            }
        }
        System.out.println("The vowels are given string is "+count);
       // System.out.println("The vowels are given string count is "+count);
        
        
        in.close();
    }
    
}
