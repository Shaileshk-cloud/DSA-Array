import java.util.HashMap;
import java.util.Scanner;

public class Two_Sum {
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
        System.out.println("\n Enter target=");
        int target=sc.nextInt();
        System.out.println("\n Initial Array =");
        printArray(arr);
        int [] result=bruteForce(arr,target);
        System.out.println("\n----------------------Brute Force Solution-------------------");
        System.out.println("\n Result =");
        printArray(result);
        System.out.println("\n Time Complexity = O(N^2)");
        System.out.println("\n Space Complexity =O(1)");
        int []result1=optimalSolution(arr,target);
        System.out.println("\n-----------------------Optimal Solution--------------------");
        System.out.println("\n Result =");
        printArray(result);
        System.out.println("\n Time Complexity = O(N)");
        System.out.println("\n Space Complexity =O(N)");

    }
    public static void printArray(int arr[])
    {
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    public static  int []  bruteForce(int [] nums,int target)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {0,0};
    }
    public static  int [] optimalSolution(int [] nums,int target)
    {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(target-nums[i]))
            {
                return new int [] {i,hmap.get(target-nums[i])};
            }
            hmap.put(nums[i],i);
        }
        return new int [] {0,0};
    }
}
