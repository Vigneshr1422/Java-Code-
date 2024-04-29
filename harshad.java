import java.util.*;
public class harshad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number ");
        int num=in.nextInt();
        int sum=0;
        int op = num;
        while (num!=0) {
            sum=sum+num%10;
            num=num/10;
            
        }
        if(op%sum==0)
        {
            System.out.println("harshard number ");
        }
        else{
            System.out.println(" not harshard number ");

        }
        System.out.println(sum);
    }
}
