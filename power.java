import java.util.*;
public class power {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("base ");
        int a=in.nextInt();
        System.out.println("exponent ");
        int b=in.nextInt();
        int res=power(a,b);
        System.out.println(res);
    }
    public static int power(int x,int y)
    {
        int result=1;
        for(int i=0;i<y;i++)
        {
            result=result*x;
            System.out.println("the value is "+result);

        }
        return result;
    }
}
