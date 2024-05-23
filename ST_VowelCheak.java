import java.util.*;
public class ST_VowelCheak {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("String word : ");
        String a=in.nextLine();
        int count =0;
        char c;
        for(int i=0;i<a.length();i++)
        {
            c=a.charAt(i);
            if(c=='a'|| c=='e' || c=='i' || c=='o'||c=='u'||c=='A'|| c=='E' || c=='I' || c=='O'||c=='U' )
            {
count++;
            }
        }
        System.out.println("Vowels count : "+count);
    }
}
