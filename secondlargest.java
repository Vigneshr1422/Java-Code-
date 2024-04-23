package summ;
import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size : ");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter the array elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("The array elements are : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println(" ");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(+arr[i]+" ");

        }
        System.out.println("the second largest elements is "+arr[size-2]);

        
        in.close();
    }
}
