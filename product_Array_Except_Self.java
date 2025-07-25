import java.util.Scanner;
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]
public class product_Array_Except_Self {
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
        bruteForce(arr);
        optimalSolution1(arr);
        optimalSolution2(arr);
    }
    public static  void printArray(int a[])
    {
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
    public static void bruteForce(int [] a)
    {
        int n=a.length;
        int [] answer= new int [n];
        int product=1;
        for(int i=0;i<n;i++)
        {
            product=1;
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    continue;
                }
                else{
                    product=product*a[j];
                }
            }
            answer[i]=product;
        }
        System.out.println("\n ---------------------------BruteForce Solution----------------------");
        System.out.println("\n Result Array =");
        printArray(answer);
        System.out.println("\n Time Complexity = O(N^2)");
        System.out.println("\n Space Complexity =O(1)");
    }
    public static void optimalSolution1(int [] a)
    {
        int n=a.length;
        int [] prefix=new int[n];
        int []  postfix=new int[n];
        int [] answer=new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*a[i-1];
        }

        postfix[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            postfix[i]=postfix[i+1]*a[i+1];
        }
        for(int i=0;i<n;i++)
        {
            answer[i]=prefix[i]*postfix[i];
        }
        System.out.println("\n ---------------------------Optimal Solution 1----------------------");
        System.out.println("\n Result Array =");
        printArray(answer);
        System.out.println("\n Time Complexity = O(N)");
        System.out.println("\n Space Complexity =O(N)+O(N)+O(N)");
    }
    public static  void optimalSolution2(int [] a)
    {
        int n=a.length;
        int [] answer = new int[n];
        answer[0]=1;
        for(int i=1;i<n;i++)
        {
            answer[i]=answer[i-1]*a[i-1];
        }
        int postfix=1;
        for(int i=n-2;i>=0;i--)
        {
            answer[i]=postfix*a[i+1]*answer[i];
            postfix=postfix*a[i+1];
        }
        System.out.println("\n ---------------------------Optimal Solution 2----------------------");
        System.out.println("\n Result Array =");
        printArray(answer);
        System.out.println("\n Time Complexity = O(N)");
        System.out.println("\n Space Complexity =O(N)");

    }

}
