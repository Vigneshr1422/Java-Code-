import java.util.*;
public class anci {
  
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a character: ");
       
        char letter = sc.next().charAt(0);
        int code = letter;
        System.out.println("ASCII value of " + letter + " is: " + code);
        sc.close();
    }
}
    
