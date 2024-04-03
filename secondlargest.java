package arrays;
import java.util.*;
public class secondlargest {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("The size of array : ");
    int size = in.nextInt();
    int arr[]= new int[size];
    System.out.println("The array elements : ");
    for(int i=0;i<size;i++)
    {
        arr[i]=in.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("The sorted array : ");
    for(int i=0;i<size;i++)
    {
        System.out.println(arr[i]+" ");
    }
    System.out.println("The second largest array is : "+arr[size-2]);
    in.close();
   } 
}
