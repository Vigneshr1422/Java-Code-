import java.util.Arrays;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first word ");
        String w1 = in.nextLine();
        System.out.print("Enter the second word ");
        String w2 = in.nextLine();
        w1=w1.toLowerCase();
        w2=w2.toLowerCase();
        if(w1.length()==w2.length())
        {
        char []s=w1.toCharArray();
        char []s1=w2.toCharArray();
        Arrays.sort(s);
        Arrays.sort(s1);

        boolean cheak=Arrays.equals(s, s1);
        {
            if(cheak)
            {
                    System.out.println(" The first word : "+w1+" and second word :  "+ w2+" are anagram");
            }
            else
            {
                System.out.println(" The first word : "+w1+" and second word "+ w2+" are  note anagram");
            }
        }
    }
    else 
    {
        System.out.println("The words are not anagram ");
    }
        in.close();
}
}