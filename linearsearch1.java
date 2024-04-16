package arrays;
import java.util.Scanner;
public class linearsearch1 {
    static int ls(int[] arr,int n, int x)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
             return i;
            }         
        }
            return -1;
        
     
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("The size : ");
        int size = in.nextInt();
        int arr[]= new int[size];
        System.out.println("The array elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Array elements ");
        for(int i=0;i<arr.length;i++)
        {
           System.out.println(arr[i]+" ");
        }
        System.out.print("The searched element : ");
        int element = in.nextInt();
        int index = ls(arr, size, element);
        if (index==-1)
        {
            System.out.println("The element not in the array");
        }
        else 
        {
            System.out.println("Element found at position "+index);
        }
        in.close();
        
    }
    
}
