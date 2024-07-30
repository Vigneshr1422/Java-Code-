package Arrays;
import java.util.*;
public class snake_pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a first array size  : ");
        int n=in.nextInt();
        System.out.println("Enter a second array size  : ");
        int m=in.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter a first array element : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
     
        System.out.println("Snake baabu pattern : ");

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
            for(int j=0;j<m;j++)
            {
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(" ");
            }
            }
            else{
                for(int j=n-1;j>=0;j--)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(" ");
            }
        }


    in.close();
    }
}
