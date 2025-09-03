import java.util.Arrays;
import java.util.Scanner;

public class Find_1_Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array size:");
        int n=sc.nextInt();
        int []   arr=new int[n];
        System.out.println("\nArray element\n");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\nInitial array ");
        printArray(arr);
        bruteForce(arr);
        optimalSolution1(arr);
        optimalSolution2(arr);
    }
    public static void printArray(int [] arr)
    {
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void bruteForce(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("\nSingle Duplicate ="+arr[i]);
                    break;
                }
            }
        }
        System.out.println("Time Complexity = O(N^2)");
        System.out.println("Space complexity = O(1)");
    }
    public static  void optimalSolution1(int [] arr)
    {
        Arrays.sort(arr);

        for (int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i])
            {
                System.out.println("\nOptimal Solution 1");
                System.out.println("\nSingle Duplicate  = "+arr[i]);
                break;
            }
        }
        System.out.println("Time Complexity = O(N log N)");
        System.out.println("Space complexity = O(1)");
    }
    public static  void optimalSolution2(int [] arr)
    {
        int slow=arr[0];
        int fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }
        while(slow!=fast);
        slow=arr[0];
        while(slow!=fast)
        {
            slow=arr[slow];
            fast=arr[fast];
        }
        System.out.println("\nOptimal Solution 2");
        System.out.println("\n Single Duplicate = "+slow);
        System.out.println("Time Complexity = O(N)");
        System.out.println("Space complexity = O(1)");

    }
}

