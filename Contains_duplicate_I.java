import java.util.HashSet;
import java.util.Scanner;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//
//Output: true
//
//Explanation:
//
//The element 1 occurs at the indices 0 and 3.
//
//Example 2:
//
//Input: nums = [1,2,3,4]
//
//Output: false
//
//Explanation:
//
//All elements are distinct.
public class Contains_duplicate_I {
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
        System.out.println("\nInitial Array =");
        printArray(arr);
        boolean result=naiveApproach(arr);
        System.out.println("\n--------------------Naive Approach----------------------");
        System.out.println("\n Result ="+result);
        System.out.println("\n Time Complexity = O(N^2)");
        System.out.println("\n Space Complexity =O(1)");

        boolean result1=optimalSolution(arr);
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
    public static boolean naiveApproach(int [] a)
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j])
                    return true;
            }
        }
        return false;
    }
    public static boolean optimalSolution(int [] nums)
    {
        int n=nums.length;
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            if(hs.contains(nums[i]))
            {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;

    }
}
