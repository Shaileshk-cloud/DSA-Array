import java.util.Scanner;

public class Sort_0s_1s_2s {
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
        dutchFlag(arr);


    }
    public static void bruteForce(int []arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
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
    public static void printArray(int arr[])
    {
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void dutchFlag(int arr[])
    {
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high)
        {
            switch(arr[mid])
            {
                case 0:
                    swap(arr,low,mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,high);
                    high--;
                    break;
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
