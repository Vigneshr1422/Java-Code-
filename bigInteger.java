import java.math.BigInteger;
import java.util.*;
public class bigInteger {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        BigInteger N=in.nextBigInteger();
        BigInteger sum=N.multiply(N.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));
        System.out.println("Answer is "+sum);
        in.close();
    }
}
