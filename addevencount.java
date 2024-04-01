package arrays;
import java.util.*;
public class addevencount {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the size : ");
    int size = in.nextInt();
    int arr[] = new int[size];
    int add=0;
    int even=0;
     for(int i =0;i<arr.length;i++)

    {
        arr[i]=in.nextInt();
        if(arr[i]%2==0)
        {even++;        }
        else{add++;}
    } 
    System.out.println("Array add element is "+add+"\nEven element is "+even);
   
}
}
