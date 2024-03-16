package javasss;
import java.util.*;
public class factorial {
    int fact(int n)
    {
        int result;
        if(n==1)
          return 1;
        result = fact(n-1)*n;
        return result;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        factorial fac = new factorial();
        
        System.out.print("Enter the number is : ");
        int z=x.nextInt();
        System.out.println("the factorial of " +z+ " is : "+ fac.fact(z));
        x.close();
    }
}
