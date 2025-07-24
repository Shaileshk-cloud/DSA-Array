import java.util.Scanner;

public class SubArray3_MaximumSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Array Size =");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\nInitial Array =");
        printArray(arr);
        navieApproach(arr);
    }
    public static  void printArray(int a[])
    {
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
    public static void navieApproach(int a [])
    {
        int n=a.length;
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            currentSum=0;
            for(int j=i;j<n;j++)
            {
                currentSum=currentSum+a[j];
                maxSum=Math.max(maxSum,currentSum);
            }
        }
        System.out.println("\n --------------------navie Approach ---------------------");
        System.out.println(" \n Maximum sum of Sub array  = "+maxSum);
        System.out.println("\n Time Complexity = O(N^2)");
        System.out.println("\n Space Complexity = O(1)");
    }
    public static  void kadane_algorithm(int [] arr )
    {
        int n=arr.length;
        int maxSum=arr[1];
        int currentSum=arr[1];
        for(int i=1;i<n;i++)
        {
            currentSum=Math.max(currentSum+arr[i],arr[i]);
            maxSum=Math.max(currentSum,maxSum);
        }
    }

}
