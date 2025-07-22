import java.util.Scanner;

public class Kadanes_Algorithum {
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
        maximumSumOfArray(arr);
    }
    public static void printArray(int [] arr)
    {
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void maximumSumOfArray(int [] arr)
    {
        int currentSum=arr[0];
        int maxSum=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            currentSum=Math.max(currentSum+arr[i],arr[i]);
            maxSum=Math.max(currentSum,maxSum);
        }
        System.out.println("\n Maximum sum of contigeous sub Array is = "+maxSum);
    }
}
