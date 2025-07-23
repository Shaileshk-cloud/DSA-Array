import java.util.Scanner;

public class Buy_Sell_Stock1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Array size = ");
        int n=sc.nextInt();
        System.out.println("Array Elements = ");
        int [] prices= new int[n];
        for(int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }
        System.out.println("\nInitial Array =");
        printArray(prices);
        bruteForceApproach(prices);
        optimaSolution(prices);
    }
    public static void printArray(int [] arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void bruteForceApproach(int [] price)
    {
        int n=price.length;
        int maxProfit=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                maxProfit=Math.max(maxProfit,price[j]-price[i]);
            }
        }
        System.out.println("\n-----------BruteForce Solution--------------");
        System.out.println("\n Maximum profit ="+maxProfit);
        System.out.println("\nTime Complexity = O(n^2)");
        System.out.println("\nSpace complexity =O(1)");
    }
    public static void optimaSolution(int [] price)
    {
        int profit=0;
        int buy=price[0];
        int maxProfit=0;
        for(int i=1;i<price.length;i++)
        {
            if(price[i]<buy)
            {
                buy=price[i];
            }
            else{
                profit=price[i]-buy;
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        System.out.println("\n---------------Optimal Solution-------------");
        System.out.println("\n Maximum profit ="+maxProfit);
        System.out.println("\nTime Complexity = O(n)");
        System.out.println("\nSpace complexity =O(1)");
    }
}
