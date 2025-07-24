import java.util.ArrayDeque;
import java.util.Scanner;

public class SubArray2_MaximumSUM_Size_K {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Array Size =");
        int n=sc.nextInt();
        int arr []= new int [n];
        System.out.println("\n Array Value =");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\n Enter K=");
        int k=sc.nextInt();
        System.out.println("\n Initial Array =");
        printArray(arr);
        navieApproach(arr,k);
        slidingWindow(arr,k);
        twoPointer(arr,k);
    }
    public static  void printArray(int a[])
    {
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
    public static void navieApproach(int [] a,int k)
    {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length-k;i++)
        {
            currentSum=0;
            for(int j=i;j<i+k;j++)
            {
                currentSum=currentSum+a[j];
            }
            maxSum=Math.max(currentSum,maxSum);

        }
        System.out.println("\n --------------------navie Approach ---------------------");
        System.out.println(" \n Maximum sum of Subarray of Length "+k+" = "+maxSum);
        System.out.println("\n Time Complexity = O(N*K)");
        System.out.println("\n Space Complexity = O(1)");
    }
    public static void slidingWindow(int [] a,int k)
    {
        ArrayDeque<Integer> window=new ArrayDeque<>();
        int windowSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(window.size()==k)
            {
                maxSum=Math.max(maxSum,windowSum);
                int ele=window.pollFirst();
                windowSum=windowSum-ele;

            }
            window.addLast(a[i]);
            windowSum=windowSum+a[i];
        }
        System.out.println("\n --------------------Sliding Window ---------------------");
        System.out.println(" \n Maximum sum of Subarray of Length "+k+" = "+maxSum);
        System.out.println("\n Time Complexity = O(N)");
        System.out.println("\n Space Complexity = O(k)");


    }
    public static  void twoPointer(int a[],int k)
    {
        int wSum=0;
        int maxSum=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        for(;right<a.length;right++)
        {
            wSum=wSum+a[right];
            if((right-left+1)==k)
            {
                maxSum=Math.max(wSum,maxSum);
                wSum=wSum-a[left];
                left++;
            }


        }
        System.out.println("\n --------------------Two Pointer ---------------------");
        System.out.println(" \n Maximum sum of Sub array of Length "+k+" = "+maxSum);
        System.out.println("\n Time Complexity = O(N)");
        System.out.println("\n Space Complexity = O(1)");
    }
}
