import java.util.Scanner;
//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
//Example 3:
//
//Input: nums = [1], target = 0
//Output: -1
public class Search_RotatedSorted_Array {
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
        System.out.println("\n Target K=");
        int k=sc.nextInt();
        System.out.println("\nInitial Array =");
        printArray(arr);
        navieApproach(arr,k);
        optimalSolution(arr,k);
    }
    public static  void printArray(int a[])
    {
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
    public static void navieApproach(int [] a,int target)
    {
        int n=a.length;
        int index=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]==target)
            {
                index=i;
                break;
            }
        }
        System.out.println("\n ---------------------------BruteForce Approach---------------------------");
        System.out.println("\n Index of Target Element = "+index);
        System.out.println("\n Time Complexity =O(N)");
        System.out.println("\n Space Complexity = O(1)");
    }
    public  static void optimalSolution(int [] arr,int target)
    {
        int n=arr.length;
        int right=n-1;
        int left=0;
        int index=0;
        int mid=0;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                index=mid;
                break;
            }
            if(arr[left]<=arr[mid])
            {
                if(target>arr[mid] || target<arr[left])
                {
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            else if(arr[mid]<arr[right])
            {
                if(target<arr[mid] || target>arr[mid])
                {
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        System.out.println("\n ---------------------------Optimal Solution---------------------------");
        System.out.println("\n Index of Target Element = "+index);
        System.out.println("\n Time Complexity =O(Log N)");
        System.out.println("\n Space Complexity = O(1)");
    }
}
