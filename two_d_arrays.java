package Arrays;
import java.util.*;
public class two_d_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size of first array ");
        int n = in.nextInt();
        System.out.println("Enter a size of second array ");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        int[][] arr2 = new int[n][m];
        if ((n != 0 && m != 0) && (n == m)) {
            System.out.println("Enter a array element in first array  ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = in.nextInt();
                }
               // System.out.print("");
            }


            System.out.println("Enter a array element in second array ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr2[i][j] = in.nextInt();
                }
                //System.out.print("");
            }

            System.out.println("The answer is ");

            addition(arr, arr2, n, m);

            System.out.println("The answer is ");

            subtraction(arr, arr2, n, m);
            System.out.println("The answer is ");

            multiplication(arr, arr2, n, m);
            System.out.println("The answer is ");

            divide(arr, arr2, n, m);
        } else {
            System.out.println("Invalid input");
        }

    }
public static void addition(int [][]arr,int [][]arr2,int m,int n)
    {
        int [][]res =new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                res[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void subtraction(int [][]arr, int [][]arr2, int n, int m)
    {
        int [][]res=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                res[i][j]=arr[i][j]-arr2[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();

        }
    }

    public static void multiplication(int [][]arr, int [][]arr2, int n, int m)
    {
        if(n!=0 || m!=0) {
            int[][] res = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    res[i][j] = arr[i][j] * arr2[i][j];
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("The one input is zero so matrix is zero ");
        }
    }


    public static void divide(int [][]arr, int [][]arr2, int n, int m)
    {
        if(m!=0) {
            int[][] res = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(arr2[i][j]!=0) {
                        res[i][j] = arr[i][j] / arr2[i][j];
                    }
                    else {
                        res[i][j]=0;
                        System.out.print("Division by Zero "+i+"and"+j+" ");
                    }
                    System.out.println(res[i][j]+" ");
                    }
                System.out.println();
            }
        }
        else {
            System.out.println("invalid row and column");
        }
    }
}
