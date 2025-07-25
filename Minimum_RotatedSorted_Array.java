import java.util.Scanner;
//Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
//
//        [4,5,6,7,0,1,2] if it was rotated 4 times.
//[0,1,2,4,5,6,7] if it was rotated 7 times.
//Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//
//Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//
//You must write an algorithm that runs in O(log n) time.
//
//
//
//Example 1:
//
//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.
//        Example 2:
//
//Input: nums = [4,5,6,7,0,1,2]
//Output: 0
//Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
//        Example 3:
//
//Input: nums = [11,13,15,17]
//Output: 11
//Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
public class Minimum_RotatedSorted_Array {
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
    public static void navieApproach(int [] a)
    {
        int n=a.length;
        int min=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("\n ---------------------------BruteForce Approach---------------------------");
        System.out.println("\n Minimum Element = "+min);
        System.out.println("\n Time Complexity =O(N)");
        System.out.println("\n Space Complexity = O(1)");
    }
    public static  void optimalSolution(int a[])
    {
        int n=a.length;
        int left=0;
        int right=n-1;
        int mid=0;
        while(left<right)
        {
             mid=left+(right-left)/2;
            if(a[mid]>a[right])
            {
                left=mid+1;
            }

            else{
                right=mid;
            }
        }
        System.out.println("\n ---------------------------Optimal Solution---------------------------");
        System.out.println("\n Minimum Element = "+a[left]);
        System.out.println("\n Time Complexity =O(Log N)");
        System.out.println("\n Space Complexity = O(1)");
    }
}
