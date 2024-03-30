package arrays;
import java.util.*;
public class maxmin {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the size : ");
    int size = in.nextInt();
    int arr[] = new int[size];
    
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=in.nextInt();
    }
    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>max)
        {max=arr[i];}
        else if (arr[i]<min)
        {
            min=arr[i];
        }
    }
    System.out.println("Maximum element is : "+max);
    System.out.println("Minimum element is : "+min);
    in.close();
}
}
