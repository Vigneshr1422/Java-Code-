package puss;
import java.util.Scanner;

public class primenumber {
 
   
        public static void main(String[] args) {
            Scanner primeCheak = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int num=primeCheak.nextInt();
            primeCheak.close();
            int i,cheak,flag=0;
            for(i=2;i<num;i++)
            {
            cheak = num%2;
            if(cheak==0)
            flag++;
            }
            if(flag==0)
            {
                System.out.println("The number "+num+" is prime ");
            }
            else{
                System.out.println("The number "+num+" is not prime ");
            }
            }
            //Scanner.close();
    
        }
        
     

