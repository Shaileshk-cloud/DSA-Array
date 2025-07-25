import java.util.ArrayDeque;
import java.util.Scanner;
//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
//
//
//        Example 1:
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Example 3:
//
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false

public class Contains_Duplicate_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Array Size =");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("\n Array Array =");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\n Enter k =");
        int k= sc.nextInt();
        System.out.println("\nInitial Array =");
        printArray(arr);
        boolean result=naiveApproach(arr,k);
        System.out.println("\n--------------------Naive Approach----------------------");
        System.out.println("\n Result ="+result);
        System.out.println("\n Time Complexity = O(N^2)");
        System.out.println("\n Space Complexity =O(1)");

        boolean result1=optimalSolution(arr,k);
        System.out.println("\n--------------------Optimal Approach----------------------");
        System.out.println("\n Result ="+result1);
        System.out.println("\n Time Complexity = O(N)");
        System.out.println("\n Space Complexity =O(N)");
    }
    public static  void printArray(int a[])
    {
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
    public static  boolean naiveApproach(int [] a,int k){
        int n= a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j] && Math.abs(i-j)<=k)
                {
                    return true;
                }
            }
        }
        return  false;
    }
    public static  boolean optimalSolution(int a[],int k)
    {
        int n=a.length;
        ArrayDeque<Integer> window=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {

            if(window.size()<=k && window.contains(a[i]))
            {
                return true;
            }
            else if(window.size()==k && !window.contains(a[i]))
            {
                window.pollFirst();
            }
            window.addLast(a[i]);
        }
        return  false;
    }
}
