package javasss;
import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner fib = new Scanner(System.in);
        System.out.print("enter the element : ");
        int a=fib.nextInt();
        int first,second,third,i;
        first =0;
        second =1;
        System.out.print(first+ " " +second+ " ");
        for (i=2;i<a;i++)
        {
            third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
        fib.close();
        
    }
}
