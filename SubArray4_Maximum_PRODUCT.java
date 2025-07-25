import java.util.Scanner;
//Given an integer array nums, find a subarray that has the largest product, and return the product.
//
//The test cases are generated so that the answer will fit in a 32-bit integer.
//
//
//
//Example 1:
//
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
public class SubArray4_Maximum_PRODUCT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Array Size =");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("\n Array Value =");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\nInitial Array =");
        printArray(arr);
        navieApproach(arr);
        optimalSolution(arr);
    }
    public static  void printArray(int a[])
    {
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
    public static  void navieApproach(int []  a)
    {
        int n=a.length;
        int product=1;
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                product=1;
                for(int k=i;k<=j;k++)
                {
                    product=product*a[k];
                    maxProduct=Math.max(maxProduct,product);
                }

            }
        }
        if(maxProduct<0)
            maxProduct=0;
        System.out.println("\n --------------------Naive Approach----------------------");
        System.out.println("\n Maximum product = "+maxProduct);
        System.out.println("\n Time Complexity =O(N^3)");
        System.out.println("\n Space Complexity = O(1)");
    }
    public static void optimalSolution(int a [])
    {
        int n=a.length;
        int currentProduct=a[0];
        int maxProduct=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            if (a[i] > 0) {
                currentProduct=currentProduct*a[i];
                maxProduct=Math.max(currentProduct,maxProduct);

            }
            else{
                currentProduct=1;
            }
        }
        if(maxProduct<0)
            maxProduct=0;
        System.out.println("\n --------------------Optimal Solution----------------------");
        System.out.println("\n Maximum product = "+maxProduct);
        System.out.println("\n Time Complexity =O(N)");
        System.out.println("\n Space Complexity =O(1)");
    }
}
