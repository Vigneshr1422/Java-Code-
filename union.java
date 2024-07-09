
import java.util.*;
public class union {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("size of first array ");
        int n=in.nextInt();
        int arr1[]=new int[n];
        System.out.println("The array element of first arrays ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=in.nextInt();
        }

        System.out.println("size of second array ");
        int m=in.nextInt();
        int arr2[]=new int[m];
        System.out.println("The array element of second arrays ");
        for(int i=0;i<m;i++)
        {
            arr2[i]=in.nextInt();
        }
        int res[]=union_(arr1,arr2);
        System.out.println("total array is ");
        for(int z=0;z<res.length;z++)
        {
            System.out.println(res[z]+" ");
        }



    }
    public static int[] union_ (int arr1[],int arr2[])
    {
        int answer[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                answer[k++] = arr1[i++];
            } else if (arr2[j] < arr1[i]) {
                answer[k++] = arr2[j++];
            } else {
                answer[k++] = arr1[i++];

            }
        }
            while (i < arr1.length) {
                answer[k++] = arr1[i++];
            }
            while (j < arr2.length) {
                answer[k++] = arr2[j++];
            }
            int finalas[]=new int[answer.length];
            for(int c=0;c< answer.length;c++)
            {
                finalas[c]=answer[c];
            }
            return finalas;


    }
}
