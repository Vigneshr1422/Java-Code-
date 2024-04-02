package arrays;
import java.util.*;
public class copyarray {
public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("Size of array : ");
    int size = in.nextInt();
    int arr[]=new int[size];
    int arr1[]=new int[size];
    System.out.println("The array elements : ");
    for(int i=0;i<size;i++)
    {
        arr[i]=in.nextInt();
    }
    for (int i=0;i<size;i++)
    {
        arr1[i]=arr[i];
    }
    System.out.println("The first array elements are : ");

    for(int i=0;i<size;i++)
    {
       System.out.println(arr[i]+" ");
    }
    System.out.println("The copy array elements are : ");
    for(int i=0;i<size;i++)
    {
        System.out.println(arr1[i]+" ");
    }


}    
}
