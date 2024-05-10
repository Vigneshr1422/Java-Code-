import java.util.*;
public class happy {
  
public static int square(int num)
{
        int temp=0;
        int sum=0;
        while(num>0)
        //num square 
        {
            int res=num%10;
            sum+=(int)Math.pow(res,2 );
            num/=10;
        
        }
        return sum;
}  
public static boolean happy(int num)
{
    int number = num;
    int temp=0;
    while(num!=1 &&  temp<10)
    {
        num=square(num);
        temp++;
    }
    if(num==1)
    {
        return true;
    }
    else{
        return false;
    }
    }
    
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter valid number : ");
    int num=in.nextInt();
    if(happy(num))
    {
        System.out.println("Happy number ");
    }   
    else{
        System.out.println("Not happy number");
    }
    
       
    }
}
    

