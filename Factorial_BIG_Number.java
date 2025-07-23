import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Factorial_BIG_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the N =");
        int n=sc.nextInt();
        List<Integer> result=new ArrayList<>();
        result.add(1);
        for(int i=2;i<=n;i++)
        {
            multiply(result,i);
        }
        Collections.reverse(result);
        System.out.println("without using BigInteger"+result);
        solution2(n);
    }
    public static void multiply(List<Integer> res,int x)
    {
        int carry=0;
        for(int i=0;i<res.size();i++)
        {
            int product=res.get(i)*x+carry;
            res.set(i,product%10);
            carry=product/10;
        }
        while(carry>0)
        {
            res.add(carry%10);
            carry=carry/10;
        }
    }
    public static void solution2(int x)
    {
        BigInteger factorial=BigInteger.ONE;
        for(int i=2;i<=x;i++){
            factorial.multiply(BigInteger.valueOf(i));
        }
        List<Integer> result=new ArrayList<>();
        for(char c: factorial.toString().toCharArray())
        {
            result.add(c-'0');
        }
        System.out.println("\nWith Using BigInteger "+result);

    }
}
