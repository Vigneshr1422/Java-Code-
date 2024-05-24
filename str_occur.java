package others;
import java.util.*;
public class str_occur {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        String s =in.nextLine();
 
        
        System.out.println("Find a letter : ");
        char c = in.next().charAt(0);
        int count = s.length() - s.replace(Character.toString(c), "").length();
 
        System.out.println("Number of occurances of '"+c+"' in "+s+" = "+count);
        in.close();
    }
}
    

