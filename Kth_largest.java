import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Kth_largest {
    private static Random random=new Random();
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
        System.out.println("\nk =\n");

        int k=sc.nextInt();
        minHeap(arr,k);
        int kth=quickSelect(arr,0,arr.length-1,k);
        System.out.println(k+" tha largest element in array is = "+kth);
        System.out.println("Best Case = O(N )");
        System.out.println("Average  Case = O(N )");
        System.out.println("worst Case = O(N*N)=O(N^2)");
    }
    public static void minHeap(int arr[],int k)
    {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int a:arr)
        {
            minHeap.add(a);
            if(minHeap.size()>k)
            {
                minHeap.poll();
            }
        }
        System.out.println(k+ " th largest element is array is = "+minHeap.peek());
        System.out.println("Time complexity = O(N log K)");
        System.out.println("Space complexity = O(K)");
    }
    public static int quickSelect(int arr[],int low ,int high,int k)
    {
        if(low==high)
            return arr[low];
        int p=partition(arr,low,high);
        if(p==k-1)
        {
            return arr[p];
        }
        else if(p>k-1)
        {
            return quickSelect(arr,low,p-1,k);
        }
        else{
            return quickSelect(arr,p+1,high,k);
        }
    }
    public static int partition(int arr[],int low,int high)
    {
        int indexP=random.nextInt(high-low+1)+low;
        swap(arr,indexP,high);
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]>pivot)
            {
                i++;
                swap(arr,i,j);

            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void swap(int arr[],int left,int right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

}
