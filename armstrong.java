import java.util.*;
import java.math.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=in.nextInt();
        if (num < 0) {
            System.out.println("enter a non-negative number.");
            return;
        }
        int store=0,sum=0,temp,digit=0;
        // first of all we find digit
        store=num;
        int again=num;
        int cheak=num;
        while(store>0)
        {
            store/=10;
            digit++;
        }
        System.out.println(digit);
        while (again>0)
        {
            int res=again%10;
            sum+=(int)Math.pow(res,digit);
            again/=10;
        }
        if(cheak==sum)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not ");
        }
    }
}
