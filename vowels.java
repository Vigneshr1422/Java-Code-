import java.util.*;
public class vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String a= in.nextLine();
        System.out.println("The Vowels Count is "+method1(a));
        System.out.println("The Vowels Count using loop is " + method2(a));
    }
    public static int method1(String a)
    {
        int count=0;
        char []b=a.toCharArray();
        for(char x : b)
            {
                switch(x)
                    {
                    case 'a':
                    case 'e':
                    case 'o':
                    case 'i':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    count++;
                    break;
                default :
                    break;
                    }
            }
        return count;
    }
     public static int method2(String a)
    {
            int b=a.length();
            int count=0;
            for(int i=0;i<b;i++)
                {
                    char x=a.charAt(i);
                    if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U' )
                    {
                        count++;
                    }
                }
            return count;
    }
}
