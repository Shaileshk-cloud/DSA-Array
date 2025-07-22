import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    private static Random random=new Random();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("\nArray element\n");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\n Original array\n");
        printArray(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println("\n Sorted array\n");
        printArray(arr);
        System.out.println("Best Case = O(N logN)");
        System.out.println("Average  Case = O(N logN)");
        System.out.println("worst Case = O(N*N)=O(N^2)");
    }
    public static void printArray(int arr[])
    {
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void quickSort(int arr[] ,int low ,int high)
    {
        if(low<high)
        {
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }
    public static int partition(int arr[],int low,int high)
    {
        int randomPivot=low+random.nextInt(high-low+1);

        int temp=arr[randomPivot];
        arr[randomPivot]=arr[high];
        arr[high]=temp;

        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pivot) {
                i++;
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
            }
        }

        int temp3=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp3;
        return i+1;
    }
}
