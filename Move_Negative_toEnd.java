import java.util.Scanner;

public class Move_Negative_toEnd {
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
        //bruteForce(arr);
        optimalApproach(arr);

    }
    public static void printArray(int arr[])
    {
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void bruteForce(int []arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]<=arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nSorted  array ");
        printArray(arr);
        System.out.println("Time complexity O(n^2)");
        System.out.println("Space complexity O(1)");
    }
    public static  void optimalApproach(int [] arr)
    {
        int i=-1;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>0) {
                i++;
                swap(arr, i, j);
            }
        }
        System.out.println("\nSorted  array ");
        printArray(arr);
        System.out.println("Time complexity O(n)");
        System.out.println("Space complexity O(1)");
    }
    public static void swap(int arr[],int left,int right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
