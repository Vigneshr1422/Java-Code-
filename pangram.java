package String;
import java.util.Scanner;
public class pangram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Word ");
        String s=in.nextLine().toLowerCase();
        char []ans=s.toCharArray();
        int []count=new int[26];
        for(int i=0;i<s.length();i++)
        {
            if(ans[i]>='a' && ans[i]<='z')
            {
                count[ans[i]-'a']++;
            }
        }
        for(int i=0;i<26;i++)
        {
           if(count[i]==0)
           {
               System.out.println("Not a pangram");
               return;
           }
        }
        System.out.println("Pangram");
    }
}
