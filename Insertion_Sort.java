import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n Array Size =");
        int n= sc.nextInt();
        int [] arr =new int[n];
        System.out.println("\n Array Value =");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\n Initial Array =");
        printArray(arr);
        insertionSort(arr);
    }
    public  static  void printArray(int [] a)
    {
        for(int n: a)
        {
            System.out.print(n+" ");
        }
    }
    public  static  void insertionSort(int [] a)
    {
        int n=a.length;
        int key=0;
        int j=0;
        for(int i=1;i<n;i++)
        {
            key=a[i];
            j=i-1;
            while(j>=0 && a[j]>=key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("\n------------------ Insertion Sort -------------------------");
        System.out.println("\n Sorted Array =");
        printArray(a);
        System.out.println("\n Average Case= O(n^2)");
        System.out.println("\n Space Complexity =O(1)");
    }
}
