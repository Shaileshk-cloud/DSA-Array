import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Kth_Smallest {
    private static Random random=new Random();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array size:");
        int n=sc.nextInt();
        int [] arr=new int [n];
        System.out.println("\nArray element\n");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\nk =");
        int k=sc.nextInt();
        maxHeap(arr,k);
        int kthE=quickSelect(arr,0,arr.length-1,k);
        System.out.println(k+" th smallest elment is using QuickSelect = "+kthE);
        System.out.println("Best Case = O(N )");
        System.out.println("Average  Case = O(N )");
        System.out.println("worst Case = O(N*N)=O(N^2)");

    }
    public static void maxHeap(int arr[],int k)
    {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr)
        {
            maxHeap.add(ele);
            if(maxHeap.size()>k)
            {
                maxHeap.poll();
            }
        }
        System.out.println(" "+k+" th smallest element is using max Heap = "+maxHeap.peek());
        System.out.println("Time complexity = O(N log K)");
        System.out.println("Space complexity = O(K)");
        //Each insertion into the heap takes O(log k) time
        //We perform this insertion for all N elements

        //The heap only stores up to k elements at any time, so space complexity is O(k)
    }
    public static int quickSelect(int arr[], int low,int high,int k)
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
