package summ;
import java.util.*;
public class leapyear {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
    System.out.println("Enter the year : ");
    int year =in.nextInt();
    if(year%4==0||(year%100==0 && year%400==0))
    {
        System.out.println(year+" is the leap year");
    }    
    else
    {
        System.out.println(year+" is not a leap year ");
    }
    in.close();
       } 
}
